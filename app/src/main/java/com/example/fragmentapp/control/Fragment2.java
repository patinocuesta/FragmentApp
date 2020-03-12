package com.example.fragmentapp.control;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.fragmentapp.MainActivity;
import com.example.fragmentapp.R;
import com.example.fragmentapp.model.Log;

import java.util.ArrayList;

import static android.content.Intent.getIntent;

public class Fragment2 extends Fragment {
    ListView l;
    ArrayList<String> listeLogs;
    ArrayAdapter<String> ar;

    public Fragment2(){
    }

    @Override
    //inflater est un objet qui va transformer les view defini en XML en objet Java
    //container est le viewgroup(RelativeLayout, frameLayout...) sers à contenir le fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            ArrayList<String> listeLogs = getArguments().getStringArrayList("params");
            l=container.findViewById(R.id.liste);
            ar = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listeLogs);
            l.setAdapter(ar);
        }

        return inflater.inflate(R.layout.fragment_cycle, container, false);
    }




}
