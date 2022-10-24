package com.example.mylistview.fragmentlayoutex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentAccount extends Fragment {
    View view;
    public FragmentAccount(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstancesState){
        view = inflater.inflate(R.layout.account_fragment_062,container, false);
        return view;
    }

}
