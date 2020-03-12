package com.example.fragmentapp.control;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.example.fragmentapp.R;

public class Fragment1 extends Fragment {
    public Fragment1(){
    }


    @Override
    //inflater est un objet qui va transformer les view defini en XML en objet Java
    //container est le viewgroup(RelativeLayout, frameLayout...) sers à contenir le fragment
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }


}
