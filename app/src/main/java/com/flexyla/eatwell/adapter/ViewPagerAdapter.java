package com.flexyla.eatwell.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.flexyla.eatwell.DejeunerFragment;
import com.flexyla.eatwell.DinerFragment;
import com.flexyla.eatwell.GouterFragment;
import com.flexyla.eatwell.PetitDejeunerFragment;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    String[] tabs;

    public ViewPagerAdapter(FragmentManager fm, String[] tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {

        System.out.println("Current position: " + position);

        switch (position) {
            case 0:
                return PetitDejeunerFragment.newInstance();
            case 1:
                return GouterFragment.newInstance();
            case 2:
                return DejeunerFragment.newInstance();
            case 3:
                return DinerFragment.newInstance();
        }

        return PetitDejeunerFragment.newInstance();
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
