package com.baj.ana.mainapp;

import android.view.View;

/**
 * Created by lenovo laptop on 15-07-2016.
 */
public class LevelItem implements LevelListItem {
    private Object wrappedObject;
    private LevelItem parent;
    private LevelView nLevelView;
    private boolean isExpanded = false;

    public LevelItem(Object wrappedObject, LevelItem parent, LevelView LevelView) {
        this.wrappedObject = wrappedObject;
        this.parent = parent;
        this.nLevelView = LevelView;
    }

    public Object getWrappedObject() {
        return wrappedObject;
    }

    @Override
    public boolean isExpanded() {
        return isExpanded;
    }
    @Override
    public LevelListItem getParent() {
        return parent;
    }
    @Override
    public View getView() {
        return nLevelView.getView(this);
    }
    @Override
    public void toggle() {
        isExpanded = !isExpanded;
    }
}


