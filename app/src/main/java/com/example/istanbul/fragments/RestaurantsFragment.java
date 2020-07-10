package com.example.istanbul.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.istanbul.R;
import com.example.istanbul.ui.main.PlaceAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantsFragment extends Fragment {


    HashMap<String, List<String>> listItem;
    ArrayList<String> listGroup;

    PlaceAdapter adapter;

    public void RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);


        return rootView;
    }


}
