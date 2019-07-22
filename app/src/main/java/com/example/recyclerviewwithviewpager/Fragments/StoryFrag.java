package com.example.recyclerviewwithviewpager.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithviewpager.Adapters.StoriesRvAdapter;
import com.example.recyclerviewwithviewpager.DataHolder.StoryDataHolder;
import com.example.recyclerviewwithviewpager.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StoryFrag extends Fragment {

    RecyclerView rvStories;
    RecyclerView.LayoutManager rvlmStories;
    StoriesRvAdapter adapter;
    List<StoryDataHolder> storyList= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_story, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvStories=view.findViewById(R.id.rvStory);
        adapter=new StoriesRvAdapter(storyList,getActivity().getApplicationContext());

        rvlmStories=new LinearLayoutManager(getActivity());
        rvStories.setLayoutManager(rvlmStories);
        rvStories.setAdapter(adapter);

        data();
    }

    private void data() {
        Date date= Calendar.getInstance().getTime();
        for(int i=0;i<=20;i++) {
            storyList.add(new StoryDataHolder("Harsh", DateFormat.getDateTimeInstance().format(date)));
            storyList.add(new StoryDataHolder("Deep", DateFormat.getDateTimeInstance().format(date)));
            storyList.add(new StoryDataHolder("Parth", DateFormat.getDateTimeInstance().format(date)));
            storyList.add(new StoryDataHolder("Krunal", DateFormat.getDateTimeInstance().format(date)));
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
