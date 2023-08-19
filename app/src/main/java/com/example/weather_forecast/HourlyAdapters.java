package com.example.weather_forecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewHolder> {

    ArrayList<Hourly>Items;
    Context context;
    public HourlyAdapters(ArrayList<Hourly> items) {
        Items = items;
        this.context = context;
    }




    @NonNull
    @Override
    public HourlyAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);
        context=parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewHolder holder, int position) {
        holder.hourTxt.setText(Items.get(position).getHour());
        holder.tempTxt.setText(Items.get(position).getTemp()+" ");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            int drawableResourceId=holder.itemView.getResources().getIdentifier(Items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getOpPackageName());

        }
    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder{
TextView hourTxt,tempTxt;
ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            hourTxt=itemView.findViewById(R.id.hourtxt);
            tempTxt=itemView.findViewById(R.id.temptxt);
            pic=itemView.findViewById(R.id.pic);

        }
    }
}
