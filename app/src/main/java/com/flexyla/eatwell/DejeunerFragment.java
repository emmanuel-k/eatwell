package com.flexyla.eatwell;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emmanuelkwene on 25/03/2016.
 */
public class DejeunerFragment extends Fragment {

    //public DejeunerFragment() {}

    public static DejeunerFragment newInstance() {
        DejeunerFragment fragment = new DejeunerFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dejeuner, container, false);
    }
}
