package com.example.mylistview.fragmentlayoutex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {
    View view;
    public FragmentHome (){
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstance){
        view = inflater.inflate(R.layout.home_fragment_062,container, false);
        return view;
    }
}

