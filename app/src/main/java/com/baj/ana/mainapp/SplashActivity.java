package com.baj.ana.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RelativeLayout f1 = (RelativeLayout) findViewById(R.id.fl1);
        RelativeLayout f2 = (RelativeLayout) findViewById(R.id.fl2);
        RelativeLayout f3 = (RelativeLayout) findViewById(R.id.fl3);
        RelativeLayout f4 = (RelativeLayout) findViewById(R.id.fl4);

        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);
        f4.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fl1:
                Intent i = new Intent(SplashActivity.this, GateinfoActivity.class);
                startActivity(i);
                break;

            case R.id.fl2:
                Intent j = new Intent(SplashActivity.this, HowtoapplyActivity.class);
                startActivity(j);
                break;

            case R.id.fl3:
                Intent k = new Intent(SplashActivity.this, EligibilityActivity.class);
                startActivity(k);
                break;

            case R.id.fl4:
                Intent l = new Intent(SplashActivity.this, OtherinfoActivity.class);
                startActivity(l);
                break;

        }

    }
}
