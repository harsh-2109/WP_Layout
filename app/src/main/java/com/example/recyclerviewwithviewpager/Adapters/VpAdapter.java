package com.example.recyclerviewwithviewpager.Adapters;

import android.widget.Switch;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.recyclerviewwithviewpager.Fragments.CallFrag;
import com.example.recyclerviewwithviewpager.Fragments.ChatFrag;
import com.example.recyclerviewwithviewpager.Fragments.StoryFrag;

public class VpAdapter extends FragmentPagerAdapter {
    int numOfTeb;

    public VpAdapter(FragmentManager fm, int numOfTeb) {
        super(fm);
        this.numOfTeb = numOfTeb;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatFrag();
            case 1:
                return new StoryFrag();
            case 2:
                return new CallFrag();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTeb;
    }
}
