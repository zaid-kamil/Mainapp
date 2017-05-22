package com.baj.ana.mainapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CsqpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csqp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout l1= (LinearLayout) findViewById(R.id.ll1);
        LinearLayout l2= (LinearLayout) findViewById(R.id.ll2);
        LinearLayout l3= (LinearLayout) findViewById(R.id.ll3);
        LinearLayout l4= (LinearLayout) findViewById(R.id.ll4);
        LinearLayout l5= (LinearLayout) findViewById(R.id.ll5);


    }

}
