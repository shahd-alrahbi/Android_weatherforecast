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

public class DomainAdapterFuture extends RecyclerView.Adapter<DomainAdapterFuture.viewHolder> {

    ArrayList<FutureDomain> Items;
    Context context;

    public DomainAdapterFuture(ArrayList<FutureDomain> items) {
        Items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public DomainAdapterFuture.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future,parent,false);
        context=parent.getContext();
        return new DomainAdapterFuture.viewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull DomainAdapterFuture.viewHolder holder, int position) {
        holder.dayTxt.setText(Items.get(position).getDay());
        holder.statusTxt.setText(Items.get(position).getStatus());
        holder.lowTxt.setText(Items.get(position).getLomTemp() + "");
        holder.highTxt.setText(Items.get(position).getHighTemp()+ "");
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
//            int drawableResourceId=holder.itemView.getResources().getIdentifier(Items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getOpPackageName());
//
//        }

    }

    @Override
    public int getItemCount() {
        return Items.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        TextView dayTxt,statusTxt,lowTxt,highTxt;
        ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            dayTxt=itemView.findViewById(R.id.dayTxt);
            statusTxt=itemView.findViewById(R.id.statusTxt);
            lowTxt=itemView.findViewById(R.id.lowTxt);
            highTxt=itemView.findViewById(R.id.highTxt);
            pic=itemView.findViewById(R.id.Pic1);
        }
    }
}
