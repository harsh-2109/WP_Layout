package com.example.recyclerviewwithviewpager.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithviewpager.DataHolder.ChatDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.util.List;

public class ChatRvAdapter extends RecyclerView.Adapter<ChatRvAdapter.MyViewHolder> {

    List<ChatDataHolder> mList;
    Context context;

    public ChatRvAdapter(List<ChatDataHolder> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_cust_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ChatDataHolder ch=mList.get(position);

        holder.tvName.setText(ch.getfName());
        holder.tvLastChat.setText(ch.getmChat());
        holder.tvTime.setText(ch.getmTime());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvLastChat,tvTime;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName= itemView.findViewById(R.id.tvName);
            tvLastChat= itemView.findViewById(R.id.tvLstMsg);
            tvTime=itemView.findViewById(R.id.tvTime);
        }
    }
}
