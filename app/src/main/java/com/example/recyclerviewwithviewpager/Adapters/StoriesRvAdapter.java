package com.example.recyclerviewwithviewpager.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithviewpager.DataHolder.StoryDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.util.List;

public class StoriesRvAdapter extends RecyclerView.Adapter<StoriesRvAdapter.MyViewHolder> {

    List<StoryDataHolder> storyList;
    Context context;

    public StoriesRvAdapter(List<StoryDataHolder> storyList, Context context) {
        this.storyList = storyList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_stories_cust_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        StoryDataHolder data=storyList.get(position);

        holder.tvUName.setText(data.getStoryUserName());
        holder.tvTime.setText(data.getStoryTimeAgo());
    }

    @Override
    public int getItemCount() {
        return storyList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvUName,tvTime;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUName=itemView.findViewById(R.id.tvUname);
            tvTime=itemView.findViewById(R.id.tvLongTime);
        }
    }
}
