package com.flexyla.eatwell;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emmanuelkwene on 25/03/2016.
 */
public class PetitDejeunerFragment extends Fragment {


    //public PetitDejeunerFragment() {}

    public static PetitDejeunerFragment newInstance() {
        PetitDejeunerFragment fragment = new PetitDejeunerFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_petit_dejeuner, container, false);
    }

}
