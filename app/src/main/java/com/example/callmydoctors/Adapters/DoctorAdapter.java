package com.example.callmydoctors.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.callmydoctors.Models.DoctorFind;
import com.example.callmydoctors.Models.MedicineBanner;
import com.example.callmydoctors.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder>  {

    ArrayList<DoctorFind> list;
    Context context;

    public DoctorAdapter(ArrayList<DoctorFind> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.find_doctor,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final DoctorFind model=list.get(position);

        holder.t1.setText(model.getdName());
        holder.t2.setText(model.getdType());
        holder.t3.setText(model.getdLocation());
        Picasso.with(context)
               .load(model.getDoctorImage())
                .into(holder.img1);

       // Glide.with(this.context)
          //      .load(list.get(position))
            //    .diskCacheStrategy(DiskCacheStrategy.ALL)
             //   .into(holder.img1);



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
            img1=itemView.findViewById(R.id.dFind);
            t1=itemView.findViewById(R.id.dDr);
            t2=itemView.findViewById(R.id.dType);
            t3=itemView.findViewById(R.id.dLocation);





        }
    }
}
