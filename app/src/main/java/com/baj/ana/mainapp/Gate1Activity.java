package com.baj.ana.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Gate1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*WebView htawebview= (WebView) findViewById(R.id.htawebview);
        htawebview.loadUrl("file:///android_asset/gateinfo.html");*/

        FrameLayout flgate = (FrameLayout) findViewById(R.id.flgate);
        FrameLayout flcategory = (FrameLayout) findViewById(R.id.flcategory);
        flgate.setOnClickListener(this);
        flcategory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.flgate:
                Intent i = new Intent(Gate1Activity.this, SplashActivity.class);
                startActivity(i);
                break;

            case R.id.flcategory:
                Intent j = new Intent(Gate1Activity.this, StreamActivity.class);
                startActivity(j);
                break;
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_chat:
                startActivity(new Intent(Gate1Activity.this,ChatActivity.class));
                return true;
            default:return false;

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gate1,menu);
        return true;

    }

}
