package com.example.callmydoctors.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.callmydoctors.Models.TopHospital;
import com.example.callmydoctors.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ViewHolder>  {

    ArrayList<TopHospital> list;
    Context context;

    public HospitalAdapter(ArrayList<TopHospital> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.top_hospital,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final TopHospital model=list.get(position);

        holder.t1.setText(model.gethName());
        holder.t2.setText(model.gethSpecialist());
        holder.t3.setText(model.gethLocation());
        Picasso.with(context)
                .load(model.getUrlImages())
                .into(holder.img1);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView t1,t2,t3;
        ImageView img1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.hImg);
            t1=itemView.findViewById(R.id.hHospital);
            t2=itemView.findViewById(R.id.hName);
            t3=itemView.findViewById(R.id.hLocation);





        }
    }
}

