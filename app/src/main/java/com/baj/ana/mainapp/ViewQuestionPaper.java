package com.baj.ana.mainapp;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.FileProvider;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

public class ViewQuestionPaper extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {

    private static final String TAG = "Storage#MainActivity";

    private static final int RC_TAKE_PICTURE = 101;
    private static final int RC_STORAGE_PERMS = 102;

    private static final String KEY_FILE_URI = "key_file_uri";
    private static final String KEY_DOWNLOAD_URL = "key_download_url";

    private BroadcastReceiver mDownloadReceiver;
    private ProgressDialog mProgressDialog;
    private FirebaseAuth mAuth;

    private Uri mDownloadUrl = null;
    private Uri mFileUri = null;
    private StorageReference mStorageRef;
    private StorageReference folderRef;
    private String folder;
    private String year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_question_paper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Restore instance state
        if (savedInstanceState != null) {
            mFileUri = savedInstanceState.getParcelable(KEY_FILE_URI);
            mDownloadUrl = savedInstanceState.getParcelable(KEY_DOWNLOAD_URL);
        }


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        if (getIntent() != null) {
            folder = getIntent().getStringExtra("com.baj.ana.mainapp.folder");
            year = getIntent().getStringExtra("com.baj.ana.year");
            FirebaseStorage storage = FirebaseStorage.getInstance();
            mStorageRef = storage.getReferenceFromUrl("gs://unique-e4555.appspot.com");
            folderRef = mStorageRef.child(folder).child(year);

            // Download receiver
            beginDownload();

            mDownloadReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    Log.d(TAG, "downloadReceiver:onReceive:" + intent);
                    hideProgressDialog();

                    if (MyDownloadService.ACTION_COMPLETED.equals(intent.getAction())) {
                        String path = intent.getStringExtra(MyDownloadService.EXTRA_DOWNLOAD_PATH);
                        long numBytes = intent.getLongExtra(MyDownloadService.EXTRA_BYTES_DOWNLOADED, 0);
                        // Alert success
                        showMessageDialog("Success", String.format(Locale.getDefault(), "%d bytes downloaded from %s", numBytes, path));
                    }
                    if (MyDownloadService.ACTION_ERROR.equals(intent.getAction())) {
                        String path = intent.getStringExtra(MyDownloadService.EXTRA_DOWNLOAD_PATH);
                        // Alert failure
                        showMessageDialog("Error", String.format(Locale.getDefault(), "Failed to download from %s", path));
                    }
                }
            };
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // Register download receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(mDownloadReceiver, MyDownloadService.getIntentFilter());
    }

    @Override
    public void onStop() {
        super.onStop();
        // Unregister download receiver
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mDownloadReceiver);
    }

    @Override
    public void onSaveInstanceState(Bundle out) {
        super.onSaveInstanceState(out);
        out.putParcelable(KEY_FILE_URI, mFileUri);
        out.putParcelable(KEY_DOWNLOAD_URL, mDownloadUrl);
    }

    @AfterPermissionGranted(RC_STORAGE_PERMS)
    private void launchCamera() {

        // Check that we have permission to read images from external storage.
        String perm = android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
        if (!EasyPermissions.hasPermissions(this, perm)) {
            EasyPermissions.requestPermissions(this, getString(R.string.rationale_storage), RC_STORAGE_PERMS, perm);
            return;
        }
        // Choose file storage location, must be listed in res/xml/file_paths.xml
        File externalDir = Environment.getExternalStorageDirectory();
        File file = new File(externalDir, "gatesetgo/" + folder + "_" + year + ".pdf");
        // Create content:// URI for file, required since Android N
        // See: https://developer.android.com/reference/android/support/v4/content/FileProvider.html
        mFileUri = FileProvider.getUriForFile(this, "com.google.firebase.quickstart.firebasestorage.fileprovider", file);
        // Create and launch the intent
    }

    private void beginDownload() {
        // Get path
        String path = "gatesetgo/" + mFileUri.getLastPathSegment();
        // Kick off download service
        Intent intent = new Intent(this, MyDownloadService.class);
        intent.setAction(MyDownloadService.ACTION_DOWNLOAD);
        intent.putExtra(MyDownloadService.EXTRA_DOWNLOAD_PATH, path);
        startService(intent);
        // Show loading spinner
        showProgressDialog();
    }

    private void showMessageDialog(String title, String message) {
        AlertDialog ad = new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .create();
        ad.show();
    }

    private void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
    }

    private void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {
    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {
    }
}
