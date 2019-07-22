package com.example.recyclerviewwithviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.recyclerviewwithviewpager.Adapters.VpAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tl;
    VpAdapter adapter;
    ViewPager vp;
    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb= findViewById(R.id.toolbar);

        setSupportActionBar(tb);

        tl= findViewById(R.id.tlMainTab);

        adapter=new VpAdapter(getSupportFragmentManager(),tl.getTabCount());

        vp= findViewById(R.id.vpLay);
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));
        vp.setAdapter(adapter);

        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
