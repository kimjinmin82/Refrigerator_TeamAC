package com.example.a6201p_03.refrigerator_teamac;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 6201P-03 on 2017-04-20.
 */


public class ExpriationFragment extends Fragment {

    public ExpriationFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_shopping,container,false);

        rootview.findViewById(R.id.ibAdd);
        return rootview;
    }
}