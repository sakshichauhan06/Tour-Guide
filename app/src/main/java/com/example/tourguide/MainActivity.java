package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Place 1", "Place 2", "Place 3", "Place 4", "Place 5", "Place 6", "Place 7"};
    String mDescription[] = {"Description 1", "Description 2", "Description 3", "Description 4", "Description 5", "Description 6", "Description 7"};
    int images[] = {};

//    paste some images in drawable folder


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}