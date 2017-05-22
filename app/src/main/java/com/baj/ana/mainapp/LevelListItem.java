package com.baj.ana.mainapp;

import android.view.View;

/**
 * Created by lenovo laptop on 15-07-2016.
 */
public interface LevelListItem {

    public boolean isExpanded();
    public void toggle();
    public LevelListItem getParent();
    public View getView();
}
