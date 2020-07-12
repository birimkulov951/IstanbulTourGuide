package com.example.istanbul.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.istanbul.R;
import com.example.istanbul.ui.main.Place;
import com.example.istanbul.ui.main.PlaceAdapter;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {

    ArrayList<Place> list;

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        fillData();

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), list);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = view.findViewById(R.id.place_info);
                //TextView  textView2 = view.findViewById(R.id.place_address);
                ImageView imageView = view.findViewById(R.id.info_image);
                //ImageView imageView2 = view.findViewById(R.id.location_image);
                //if (/*textView != null &&*/ textView2 != null /*&& imageView != null && imageView2 != null*/) {
                textView.setVisibility(textView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                //.setVisibility(textView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                imageView.setVisibility(imageView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                //imageView2.setVisibility(imageView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                //}
            }
        });

        return rootView;
    }

    public void fillData(){
        list = new ArrayList<>();
        list.add(new Place (R.drawable.tombili_3,getString(R.string.monuments3),getString(R.string.monuments3District), getString(R.string.monuments3Info)));
        list.add(new Place (R.drawable.manas_one,getString(R.string.monuments1),getString(R.string.monuments1District), getString(R.string.monuments1Info)));
        list.add(new Place (R.drawable.ataturk_6,getString(R.string.monuments6),getString(R.string.monuments6District), getString(R.string.monuments6Info)));
        list.add(new Place (R.drawable.liberty_monument_2,getString(R.string.monuments2),getString(R.string.monuments2District), getString(R.string.monuments2Info)));
        list.add(new Place (R.drawable.sultan_7,getString(R.string.monuments7),getString(R.string.monuments7District), getString(R.string.monuments7Info)));
        list.add(new Place (R.drawable.republic_4,getString(R.string.monuments4),getString(R.string.monuments4District), getString(R.string.monuments4Info)));
        list.add(new Place (R.drawable.constantine_monument_5,getString(R.string.monuments5),getString(R.string.monuments5District), getString(R.string.monuments5Info)));
    }
}
