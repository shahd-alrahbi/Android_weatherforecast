package com.example.weather_forecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
private RecyclerView.Adapter adapterTommorow;
public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView();
    }
    private  void recyclerView(){
        ArrayList<FutureDomain> items=new ArrayList<>();
        items.add(new FutureDomain("Sat","storm","storm",25,10));
        items.add(new FutureDomain("Sun","cloudy","cloudy",25,10));
        items.add(new FutureDomain("Mon","windy","windy",25,10));
        items.add(new FutureDomain("Tue","cloudy_sunny","cloudy_sunny",25,10));
        items.add(new FutureDomain("Wen","sun","Sunny",25,10));
        items.add(new FutureDomain("Thu","sun","Sunny",25,10));
        items.add(new FutureDomain("Sat","storm","storm",25,10));
        items.add(new FutureDomain("Sun","cloudy","cloudy",25,10));
        items.add(new FutureDomain("Mon","windy","windy",25,10));
        items.add(new FutureDomain("Tue","cloudy_sunny","cloudy_sunny",25,10));
        items.add(new FutureDomain("Wen","sun","Sunny",25,10));
        items.add(new FutureDomain("Thu","sun","Sunny",25,10));


        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapterTommorow=new DomainAdapterFuture(items);
        recyclerView.setAdapter(adapterTommorow);


    }
}