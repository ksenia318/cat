package com.example.cats;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    Context context;
    LayoutInflater inflater;
    ArrayList<ImageResponce> list;


    AdapterList(Context context, ArrayList<ImageResponce> list){
        this.context=context;
        this.list=list;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.card_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ViewHolder holder, int position) {
//        holder.button.setOnClickListener(v ->{
//            Intent intent=new Intent(context, MainActivity2.class);
//            context.startActivity(intent);
//        });
        ImageResponce cat= list.get(position);
        holder.textView.setText(cat.Name);
        holder.textView1.setText(cat.City);
        holder.textView2.setText(cat.contact.email);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final Button button;
        final TextView textView;
        final TextView textView1;
        final TextView textView2;
        public ViewHolder(View view) {
            super(view);
            button=view.findViewById(R.id.button);
            textView=view.findViewById(R.id.name);
            textView1=view.findViewById(R.id.city);
            textView2=view.findViewById(R.id.contact);
        }
    }
}
