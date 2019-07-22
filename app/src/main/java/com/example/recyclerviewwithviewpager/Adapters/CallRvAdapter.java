package com.example.recyclerviewwithviewpager.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithviewpager.DataHolder.CallDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.util.List;

public class CallRvAdapter extends RecyclerView.Adapter<CallRvAdapter.MyViewHolder> {

    List<CallDataHolder> callData;
    Context context;

    public CallRvAdapter(List<CallDataHolder> callData, Context context) {
        this.callData = callData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_call_cust_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        CallDataHolder call=callData.get(position);

        holder.tvCallName.setText(call.getCallerName());
        holder.tvCalltime.setText(call.getCallingTime());
    }

    @Override
    public int getItemCount() {
        return callData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCallName, tvCalltime;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCallName=itemView.findViewById(R.id.tvCallerName);
            tvCalltime=itemView.findViewById(R.id.tvCallTime);
        }
    }
}
