package com.example.mylistview.fragmentlayoutex;

import  android.icu.text.CaseMap;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class viewpageadapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public viewpageadapter (FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount(){
        return FragmentListTitles.size();
    }

    @Override
    public Fragment getItem(int position){
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return FragmentListTitles.get(position);
    }

    public void AddFragment (Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}
