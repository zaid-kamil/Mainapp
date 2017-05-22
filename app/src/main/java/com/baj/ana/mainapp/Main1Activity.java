package com.baj.ana.mainapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView ivOne = (ImageView) findViewById(R.id.ivOne);
        final ImageView ivTwo = (ImageView) findViewById(R.id.ivTwo);
        final ImageView ivThree = (ImageView) findViewById(R.id.ivThree);


        ivOne.setY(-1500f);
        ivTwo.setY(-1500f);
        ivThree.setY(-1500f);
        ivOne.animate().translationY(0).setInterpolator(new OvershootInterpolator()).setDuration(500).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                ivTwo.animate().translationY(0).setInterpolator(new OvershootInterpolator()).setDuration(500).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        ivThree.animate().translationY(0).setInterpolator(new OvershootInterpolator()).setDuration(500).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                Intent i = new Intent(Main1Activity.this, LoginActivity.class);
                                startActivity(i);
                                finish();
                            }
                        });
                    }
                });
            }
        });

        //  ImageView i1= (ImageView) findViewById(R.id.imageView14);
        // i1.animate().scaleX(1.5f).scaleY(1.5f).setDuration(3000).setInterpolator(new AnticipateOvershootInterpolator()).start();
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
            }
        }.execute();


        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
       // DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Hello, World!");*/
    }

}
