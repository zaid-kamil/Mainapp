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

import java.util.ArrayList;
import java.util.Map;

public class Bookmark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences bookmarks = getSharedPreferences("bookmarks", MODE_PRIVATE);
        final Map<String, ?> bookmarksAll = bookmarks.getAll();
        final ArrayList<String> marks = new ArrayList<>();
        for (String key : bookmarksAll.keySet()) {
            marks.add(key);
        }
        ListView listBookmarks = (ListView) findViewById(R.id.listBookmark);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marks);
        listBookmarks.setAdapter(adapter);
        listBookmarks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*String className = bookmarksAll.get(marks.get(position)).toString();
                Intent intent = null;
                try {
                    intent = new Intent(Bookmark.this,Class.forName("com.baj.ana.mainapp."+className));
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }*/

            }
        });
    }

}
