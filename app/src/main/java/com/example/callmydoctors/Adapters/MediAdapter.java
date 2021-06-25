package com.example.callmydoctors.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.callmydoctors.Models.MedicineBanner;
import com.example.callmydoctors.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MediAdapter extends RecyclerView.Adapter<MediAdapter.ViewHolder>  {

    ArrayList<MedicineBanner> list;
    Context context;

    public MediAdapter(ArrayList<MedicineBanner> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_med,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final MedicineBanner model=list.get(position);

        Picasso.with(context)
                .load(model.getImage())
                .into(holder.img1);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView img1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.mBanner);




        }
    }
}
