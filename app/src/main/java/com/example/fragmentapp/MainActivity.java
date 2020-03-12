package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fragmentapp.control.Fragment2;
import com.example.fragmentapp.control.LogCaption;
import com.example.fragmentapp.model.DAO.LogDAO;
import com.example.fragmentapp.model.Log;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int counter;
    LogCaption lc;
    LogDAO ld = new LogDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent =  new Intent(MainActivity.this, Fragment2.class );

        lc= new LogCaption();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("params", (ArrayList<String>) ld.getAll());


    }
}
