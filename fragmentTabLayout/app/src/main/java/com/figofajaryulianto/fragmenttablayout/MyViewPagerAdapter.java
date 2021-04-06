package com.figofajaryulianto.fragmenttablayout;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class MyViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> arrayListFragment;
    ArrayList<String> arrayListjudul;

    public MyViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> arrayListFragment, ArrayList<String> arrayListjudul) {
        super(fm);
        this.arrayListFragment = arrayListFragment;
        this.arrayListjudul = arrayListjudul;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayListFragment.get(position);
    }

    @Override
    public int getCount() {
        return arrayListFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayListjudul.get(position);
    }
}
