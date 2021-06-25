package com.example.callmydoctors.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.callmydoctors.Models.DoctorFind;
import com.example.callmydoctors.Models.TopSpcealist;
import com.example.callmydoctors.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TopSpcialistAdapter extends RecyclerView.Adapter<TopSpcialistAdapter.ViewHolder>  {

    ArrayList<TopSpcealist> list;
    Context context;

    public TopSpcialistAdapter(ArrayList<TopSpcealist> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.top_spcealist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final TopSpcealist model=list.get(position);

        holder.t1.setText(model.getNameSpecialist());
        holder.t2.setText(model.getMeet());
        holder.t3.setText(model.getChronic());
        holder.t4.setText(model.getDoctors());
        Picasso.with(context)
                .load(model.getImgUrl())
                .into(holder.img1);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView t1,t2,t3,t4;
        ImageView img1;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.tSpecialist);
            t1=itemView.findViewById(R.id.tOrt);
            t2=itemView.findViewById(R.id.tMeet);
            t3=itemView.findViewById(R.id.tChronic);
            t4=itemView.findViewById(R.id.tDoc);



        }
    }
}
