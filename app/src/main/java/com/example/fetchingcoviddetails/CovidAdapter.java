package com.example.fetchingcoviddetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CovidAdapter extends RecyclerView.Adapter<CovidViewHolder> {
    @NonNull
   private List<ResponseModel> responseModels;
    public CovidAdapter(List<ResponseModel> responseModels){
        this.responseModels =responseModels;
    }
    @Override

    public CovidViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getItemCount(),parent,false);
        return new CovidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidViewHolder holder, int position) {
        holder.getAdapterPosition();

    }

    @Override
    public int getItemCount() {
        return responseModels.size();
    }
}
