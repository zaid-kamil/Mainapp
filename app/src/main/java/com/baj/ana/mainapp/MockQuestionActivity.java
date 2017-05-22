package com.baj.ana.mainapp;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MockQuestionActivity extends AppCompatActivity implements FragmentPageChangeListener {

    private CustomMockViewPager pager;
    private DatabaseReference mocks;
    private QuestionPagerAdapter adapter;
    private TextView tvTimer;
    private String category;
    ArrayList<QuestionModel> questions = new ArrayList<>();
    private String subCategory;
    private SharedPreferences mock_pref;
    int totalMocksPoints = 0;
    private ProgressBar pbProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_question);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        mock_pref = getSharedPreferences("mock_pref", MODE_PRIVATE);
        String category = mock_pref.getString("category", "");
        final String mock_set = mock_pref.getString("set", "mock1");
        mocks = db.getReference("mock").child(category);

        //dialog.show();

        tvTimer = (TextView) findViewById(R.id.tvTimer);
        pager = (CustomMockViewPager) findViewById(R.id.pager);
        pbProgress = (ProgressBar) findViewById(R.id.pbProgress);
        adapter = new QuestionPagerAdapter(getSupportFragmentManager());
        //prefs
        getSupportActionBar().setTitle(category.toUpperCase() + " Mock paper");
        getSupportActionBar().setSubtitle(mock_set.toUpperCase() + " Mock paper");

        mocks.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                questions.clear();
                if (dataSnapshot != null && dataSnapshot.hasChildren()) {
                    long count = dataSnapshot.getChildrenCount();
                    //tvTimer.setText(String.valueOf(count));
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        //String setName = snapshot.child("set").getValue(String.class);
                        if (snapshot.child("set").getValue(String.class).equalsIgnoreCase(mock_set)) {
                            questions.add(new QuestionModel(snapshot));
                            adapter.notifyDataSetChanged();
                        }
                    }


                    if (questions != null && questions.size() > 0) {
                        pager.setAdapter(adapter);
                        pager.setPagingEnabled(false);
                        displayBeginDialog();
                        pbProgress.animate().scaleX(0).scaleY(0).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        pbProgress.setVisibility(View.GONE);
                    } else {
                        Toast.makeText(MockQuestionActivity.this, "no questions available now", Toast.LENGTH_SHORT).show();
                        pbProgress.animate().scaleX(0).scaleY(0).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        pbProgress.setVisibility(View.GONE);

                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(MockQuestionActivity.this, "error: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void displayBeginDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Start Your Test")
                .setMessage("You have 20 min to solve 30 question on.\nRight answer give you 1 point, and wrong answer gives you -1 point.\nLets begin")
                .setPositiveButton("Begin Test Now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        new CountDownTimer(60000 * 20, 1000) {
                            @Override
                            public void onTick(long l) {
                                tvTimer.setText(String.valueOf(l / (1000)) + " secs");
                            }

                            @Override
                            public void onFinish() {
                                endMockTest();
                            }
                        }.start();
                    }
                }).create();
        dialog.setCancelable(false);
        dialog.show();
    }

    @Override
    public void loadNextPage(int position) {
        pager.setCurrentItem(position, true);
    }

    @Override
    public void loadPreviousPage(int position) {
        pager.setCurrentItem(position, true);
    }

    @Override
    public void loadNextPageOnTimeUp(int position) {
        loadNextPage(position);
    }

    @Override
    public void endMockTest() {

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Mock Result")
                .setMessage("You achieved " + totalMocksPoints + " points")
                .setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MockQuestionActivity.this.finish();
                    }
                }).create();
        dialog.show();

    }

    @Override
    public void addOnePoints() {
        totalMocksPoints++;
    }

    @Override
    public void removeOnePoints() {
        totalMocksPoints--;
    }


    public class QuestionPagerAdapter extends FragmentPagerAdapter {
        QuestionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return MockQuestionFragment.newInstance(questions.get(position), position);
        }

        @Override
        public int getCount() {
            return questions.size();
        }
    }


}
