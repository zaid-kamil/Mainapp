package com.baj.ana.mainapp;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by lenovo laptop on 31-07-2016.
 */
public class QuestionModel {
    private DataSnapshot snapshot;


    public QuestionModel(DataSnapshot snapshot) {
        this.snapshot = snapshot;
    }

    public DataSnapshot getSnapshot() {
        return snapshot;
    }

    public String getOptionA() {
        return snapshot.child("a").getValue(String.class);
    }

    public String getOptionB() {
        return snapshot.child("b").getValue(String.class);
    }

    public String getOptionC() {
        return snapshot.child("c").getValue(String.class);
    }

    public String getOptionD() {
        return snapshot.child("d").getValue(String.class);
    }

    public String getAnswer() {
        return snapshot.child("anwser").getValue(String.class);
    }

    public String getQuestion() {
        return snapshot.child("question").getValue(String.class);
    }
}
