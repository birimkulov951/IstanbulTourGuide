package com.example.istanbul.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.istanbul.R;

public class HotelsFragment extends Fragment {


    //HashMap<String, List<String>> listItem;
    //ArrayList<String> listGroup;

    //ContentAdapter adapter;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);



        return rootView;
    }

    /*private void initListData () {
        listGroup.add(getString(R.string.places_group1));
        listGroup.add(getString(R.string.places_group2));
        listGroup.add(getString(R.string.places_group3));
        listGroup.add(getString(R.string.places_group4));
        listGroup.add(getString(R.string.places_group5));

        String[] array;

        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.places_group1);
        for  (String item: array) {
            list1.add(item);
        }

        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.places_group1);
        for  (String item: array) {
            list1.add(item);
        }

        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.places_group1);
        for  (String item: array) {
            list1.add(item);
        }

        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.places_group1);
        for  (String item: array) {
            list1.add(item);
        }

        List<String> list5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.places_group1);
        for  (String item: array) {
            list1.add(item);
        }

        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);
        listItem.put(listGroup.get(4),list5);

        adapter.notify();
    }*/
}
