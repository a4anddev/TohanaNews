package com.tohananews.tohana.tohananews.adapaters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tohananews.tohana.tohananews.R;
import com.tohananews.tohana.tohananews.FullNewsActivity;
import com.tohananews.tohana.tohananews.models.TohanaNewsModel;

import java.util.List;

public class TohanaNewsAdapter extends RecyclerView.Adapter<TohanaNewsAdapter.MyViewHolder>{

    Context mContext;
    private List<TohanaNewsModel> newsModelList;

    public TohanaNewsAdapter(Context mContext, List<TohanaNewsModel> newsModelList) {
        this.mContext = mContext;
        this.newsModelList = newsModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_list, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        TohanaNewsModel tohanaNewsModel = newsModelList.get(position);

        holder.title.setText("Overweight And Pets? tips To access Your Peg's Health");
        holder.category.setText("Health");
        holder.date.setText("Sep 15th, 2018 by manu singlea");


        holder.fullnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, FullNewsActivity.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return newsModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, date, category;
        public LinearLayout fullnews;
        public ImageView img;
        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);
            category = itemView.findViewById(R.id.category);
            img = itemView.findViewById(R.id.img);
            fullnews = itemView.findViewById(R.id.fullnews);
        }
    }
}
