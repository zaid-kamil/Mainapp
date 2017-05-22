package com.baj.ana.mainapp;

import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by lenovo laptop on 15-07-2016.
 */
public class Adapter extends BaseAdapter {

    List<LevelItem> list;
    List<LevelListItem> filtered;
    public void setFiltered(ArrayList<LevelListItem> filtered) {
        this.filtered = filtered;

    }
    public Adapter(List<LevelItem> list) {
        this.list = list;
        this.filtered = filterItems();
    }

    @Override
    public int getCount() {
        return filtered.size();
    }

    @Override
    public LevelListItem getItem(int arg0) {
        return filtered.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return 0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {

        return getItem(arg0).getView();
    }

    public NLevelFilter getFilter() {
        return new NLevelFilter();
    }


    class NLevelFilter {

        public void filter() {
            new AsyncFilter().execute();
        }

        class AsyncFilter extends AsyncTask<Void, Void, ArrayList<LevelListItem>> {

            @Override
            protected ArrayList<LevelListItem> doInBackground(Void... arg0) {

                return (ArrayList<LevelListItem>) filterItems();
            }

            @Override
            protected void onPostExecute(ArrayList<LevelListItem> result) {
                setFiltered(result);
                Adapter.this.notifyDataSetChanged();
            }
        }


    }

    public List<LevelListItem> filterItems() {
        List<LevelListItem> tempfiltered = new ArrayList<LevelListItem>();
        OUTER: for (LevelListItem item : list) {
            //add expanded items and top level items
            //if parent is null then its a top level item
            if(item.getParent() == null) {
                tempfiltered.add(item);
            } else {
                //go through each ancestor to make sure they are all expanded
                LevelListItem parent = item;
                while ((parent = parent.getParent())!= null) {
                    if (!parent.isExpanded()){
                        //one parent was not expanded
                        //skip the rest and continue the OUTER for loop
                        continue OUTER;
                    }
                }
                tempfiltered.add(item);
            }
        }

        return tempfiltered;
    }

    public void toggle(int arg2) {
        filtered.get(arg2).toggle();
    }
}


