package com.example.fragmentapp.control;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class LogCaption extends Fragment2 {

com.example.fragmentapp.model.Log l;
    private int counter;
    public LogCaption(){

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("cycle","fragment onAttach");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment onAttach");
    }
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("cycle","fragment onCReate");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment onCReate");

    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d("cycle","fragment onActivityCReated");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment onActivityCReated");

    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("cycle","fragment a demarre");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment demarre");

    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("cycle","fragment a resume");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment resume");

    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("cycle","fragment a pause");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment pause");

    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("cycle","fragment a stoppe");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment stoppe");

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("cycle","fragment est detruite");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment detruite");

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("cycle","fragment est detruite view");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment view detruite");

    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("cycle","fragment est detache");
        l= new com.example.fragmentapp.model.Log(counter++, "fragment detache");

    }
}
