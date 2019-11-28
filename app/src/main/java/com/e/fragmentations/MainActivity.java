package com.e.fragmentations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    /*private Toolbar supportActionBar;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.myViewPager);
        toolbar.setTitle("Fragments");
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);



    }
    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new ChatFragment(),"CHATS");
        viewPagerAdapter.addFragment(new StatusFragment(),"STATUS");
        viewPagerAdapter.addFragment(new CallsFragment(),"CALLS");
        viewPager.setAdapter(viewPagerAdapter);
    }

    /*public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }*/
}
