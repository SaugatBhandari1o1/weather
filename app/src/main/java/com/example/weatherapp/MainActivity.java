package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText userInputtv;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apiURL = "https://api.openweathermap.org/data/2.5/weather?q=kathmandu&appid=b31f986179635820b5d31e28a4cf9fc2";

        userInputtv = findViewById(R.id.search);
        TextView textView = findViewById(R.id.dayView);
        TextView textView1 = findViewById(R.id.cloudTv);

        RecyclerView recyclerView = findViewById(R.id.dayView);

        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);


//
    }

}