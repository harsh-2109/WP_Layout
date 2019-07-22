package com.example.recyclerviewwithviewpager.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.recyclerviewwithviewpager.Adapters.ChatRvAdapter;
import com.example.recyclerviewwithviewpager.DataHolder.ChatDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.Inflater;


public class ChatFrag extends Fragment {

    RecyclerView rvChat;
    RecyclerView.LayoutManager rvLayotManager;
    ChatRvAdapter adapter;
    List<ChatDataHolder> chatList= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvChat=view.findViewById(R.id.rvChat);
        adapter=new ChatRvAdapter(chatList,getContext().getApplicationContext());

        rvLayotManager=new LinearLayoutManager(getActivity());
        rvChat.setLayoutManager(rvLayotManager);
        rvChat.setAdapter(adapter);

        data();

    }

    private void data() {
        Date date= Calendar.getInstance().getTime();
        for(int i=0;i<=30;i++) {
            chatList.add(new ChatDataHolder("Harsh", "Hello Deep", DateFormat.getTimeInstance().format(date)));
            chatList.add(new ChatDataHolder("Krunal", "Hello Parth", DateFormat.getTimeInstance().format(date)));
            chatList.add(new ChatDataHolder("Parth", "Dhoi aap ne deepu", DateFormat.getTimeInstance().format(date)));
        }
        adapter.notifyDataSetChanged();
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
