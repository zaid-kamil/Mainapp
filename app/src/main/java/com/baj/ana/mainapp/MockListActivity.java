package com.baj.ana.mainapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MockListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv = (ListView) findViewById(R.id.lvCSMockCategory);
        final String[] topics = new String[]{"mock1", "mock2"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, topics);
        lv.setAdapter(adapter);
        final SharedPreferences mock_pref = getSharedPreferences("mock_pref", MODE_PRIVATE);
        getSupportActionBar().setTitle(mock_pref.getString("category","").toUpperCase()+" Mock paper");
        //shared pref
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mock_pref.edit().putString("set",topics[position]).apply();
                Intent next = new Intent(MockListActivity.this, MockQuestionActivity.class);
                startActivity(next);
            }
        });
    }
}
