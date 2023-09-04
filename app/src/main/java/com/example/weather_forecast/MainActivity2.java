package com.example.weather_forecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initRecyclerView();
        setVarible();
    }

    private void setVarible() {
        TextView next7dayBtn=findViewById(R.id.day);
        next7dayBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this,MainActivity3.class)));
    }

    private  void initRecyclerView(){
        ArrayList<Hourly> items=new ArrayList<>();
        items.add(new Hourly("9pm",28,"cloudy"));
        items.add(new Hourly("9pm",28,"sunny"));
        items.add(new Hourly("9am",30,"wind"));
        items.add(new Hourly("9pm",28,"rainy"));
        items.add(new Hourly("9pm",27,"storm"));

        recyclerView=findViewById(R.id.viwe1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly =new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
}
}