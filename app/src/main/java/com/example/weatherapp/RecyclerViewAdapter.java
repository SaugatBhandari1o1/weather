package com.example.weatherapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    Activity activity;
    ArrayList<MyDataModel> posts;

    public RecyclerViewAdapter(Activity activity, ArrayList<MyDataModel> posts){
        this.activity = activity;
        this.posts = posts;
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.locationTv.setText(posts.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView locationTv, cloudTv, tempTv;
        ImageView bg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
