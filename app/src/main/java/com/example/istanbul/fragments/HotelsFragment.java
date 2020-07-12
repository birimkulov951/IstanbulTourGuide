package com.example.istanbul.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.istanbul.R;
import com.example.istanbul.ui.main.Place;
import com.example.istanbul.ui.main.PlaceAdapter;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    ArrayList<Place> list;

    public HotelsFragment() {
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
                TextView  textView2 = view.findViewById(R.id.place_address);
                TextView  textView3 = view.findViewById(R.id.place_call_number);
                ImageView imageView = view.findViewById(R.id.info_image);
                ImageView imageView2 = view.findViewById(R.id.location_image);
                ImageView imageView3 = view.findViewById(R.id.call_image);
                //if (/*textView != null &&*/ textView2 != null /*&& imageView != null && imageView2 != null*/) {
                textView.setVisibility(textView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                textView2.setVisibility(textView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                textView3.setVisibility(textView3.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                imageView.setVisibility(imageView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                imageView2.setVisibility(imageView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                imageView3.setVisibility(imageView3.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                //}
            }
        });

        return rootView;
    }

    public void fillData(){
        list = new ArrayList<>();
        list.add(new Place(R.drawable.sumahan_one,getString(R.string.hotels1),getString(R.string.hotels1District), getString(R.string.hotels1Info),getString(R.string.hotels1Address),getString(R.string.hotels1Google),getString(R.string.hotels1Call)));
        list.add(new Place (R.drawable.george_hotel,getString(R.string.hotels2),getString(R.string.hotels2District), getString(R.string.hotels2Info),getString(R.string.hotels2Address),getString(R.string.hotels2Google),getString(R.string.hotels2Call)));
        list.add(new Place (R.drawable.shangri_ist,getString(R.string.hotels3),getString(R.string.hotels3District), getString(R.string.hotels3Info),getString(R.string.hotels3Address),getString(R.string.hotels3Google),getString(R.string.hotels3Call)));
        list.add(new Place (R.drawable.pera_palace,getString(R.string.hotels4),getString(R.string.hotels4District), getString(R.string.hotels4Info),getString(R.string.hotels4Address),getString(R.string.hotels4Google),getString(R.string.hotels4Call)));
        list.add(new Place (R.drawable.tomtom_hotel,getString(R.string.hotels5),getString(R.string.hotels5District), getString(R.string.hotels5Info),getString(R.string.hotels5Address),getString(R.string.hotels5Google),getString(R.string.hotels5Call)));
        list.add(new Place (R.drawable.four_seasons,getString(R.string.hotels6),getString(R.string.hotels6District), getString(R.string.hotels6Info),getString(R.string.hotels6Address),getString(R.string.hotels6Google),getString(R.string.hotels6Call)));
        list.add(new Place (R.drawable.romance_ist,getString(R.string.hotels7),getString(R.string.hotels7District), getString(R.string.hotels7Info),getString(R.string.hotels7Address),getString(R.string.hotels7Google),getString(R.string.hotels7Call)));
    }
}
