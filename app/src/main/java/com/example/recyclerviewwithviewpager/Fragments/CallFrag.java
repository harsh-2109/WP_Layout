package com.example.recyclerviewwithviewpager.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithviewpager.Adapters.CallRvAdapter;
import com.example.recyclerviewwithviewpager.DataHolder.CallDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CallFrag extends Fragment {

    RecyclerView rvCall;
    RecyclerView.LayoutManager rvlmCall;
    CallRvAdapter adapter;
    List<CallDataHolder> callList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCall=view.findViewById(R.id.rvCall);
        rvlmCall=new LinearLayoutManager(getContext().getApplicationContext());
        rvCall.setLayoutManager(rvlmCall);

        adapter=new CallRvAdapter(callList,getContext().getApplicationContext());
        rvCall.setAdapter(adapter);

        callData();
    }

    private void callData() {
        Date date= Calendar.getInstance().getTime();
        for(int i=0;i<=9;i++) {
            callList.add(new CallDataHolder("Krunal", DateFormat.getDateInstance().format(date)));
            callList.add(new CallDataHolder("Parth", DateFormat.getDateInstance().format(date)));
            callList.add(new CallDataHolder("Deep", DateFormat.getDateInstance().format(date)));
        }

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fr_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.app_bar_search:
                Toast.makeText(getContext().getApplicationContext(), "Search Button Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.miMenu:
                Toast.makeText(getContext().getApplicationContext(), "More Option Clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
