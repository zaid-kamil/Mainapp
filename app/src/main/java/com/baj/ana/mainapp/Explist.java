package com.baj.ana.mainapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class Explist extends AppCompatActivity {

    List<LevelItem> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.listView1);
        list = new ArrayList<LevelItem>();
        Random rng = new Random();
        final LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < 5; i++) {

            final LevelItem grandParent = new LevelItem(new SomeObject("GrandParent " + i), null, new LevelView() {

                @Override
                public View getView(LevelItem item) {
                    View view = inflater.inflate(R.layout.list_item, null);
                    TextView tv = (TextView) view.findViewById(R.id.textView);
                    tv.setBackgroundColor(Color.GREEN);
                    String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                    tv.setText(name);
                    return view;
                }
            });
            list.add(grandParent);
            int numChildren = rng.nextInt(4) + 1;
            for (int j = 0; j < numChildren; j++) {
                LevelItem parent = new LevelItem(new SomeObject("Parent " + j), grandParent, new LevelView() {

                    @Override
                    public View getView(LevelItem item) {
                        View view = inflater.inflate(R.layout.list_item, null);
                        TextView tv = (TextView) view.findViewById(R.id.textView);
                        tv.setBackgroundColor(Color.YELLOW);
                        String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                        tv.setText(name);
                        return view;
                    }
                });

                list.add(parent);
            }
        }

        Adapter adapter = new Adapter(list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                ((Adapter) listView.getAdapter()).toggle(arg2);
                ((Adapter) listView.getAdapter()).getFilter().filter();

            }
        });
    }

    class SomeObject {
        public String name;

        public SomeObject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}




