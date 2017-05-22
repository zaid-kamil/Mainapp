package com.baj.ana.mainapp;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class QuestionPapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_papers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView recycleView = (RecyclerView) findViewById(R.id.recycle_view);
        LinearLayoutManager recycleLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycleView.setLayoutManager(recycleLayoutManager);
        recycleView.setItemAnimator(new DefaultItemAnimator());
        //RecycleCardsAdapter QuestionPapersAdapter = new RecycleCardsAdapter(DataUtils.getAlbumsData());
        // recycleView.setAdapter(QuestionPapersAdapter);


    }
}
