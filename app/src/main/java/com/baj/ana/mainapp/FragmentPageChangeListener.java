package com.baj.ana.mainapp;

/**
 * Created by asit on 20/1/17.
 */

public interface FragmentPageChangeListener {
    void loadNextPage(int position);

    void loadPreviousPage(int position);

    void loadNextPageOnTimeUp(int position);

    void endMockTest();

    void addOnePoints();

    void removeOnePoints();
}
