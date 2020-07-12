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
import java.util.HashMap;
import java.util.List;

public class RestaurantsFragment extends Fragment {

    ArrayList<Place> list;

    public RestaurantsFragment() {
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
        list.add(new Place (R.drawable.maidens_3,getString(R.string.restaurants3),getString(R.string.restaurants3District), getString(R.string.restaurants3Info),getString(R.string.restaurants3Address),getString(R.string.restaurants3Google),getString(R.string.restaurants3Call)));
        list.add(new Place (R.drawable.rana_1,getString(R.string.restaurants1),getString(R.string.restaurants1District), getString(R.string.restaurants1Info),getString(R.string.restaurants1Address),getString(R.string.restaurants1Google),getString(R.string.restaurants1Call)));
        list.add(new Place (R.drawable.banyan_2,getString(R.string.restaurants2),getString(R.string.restaurants2District), getString(R.string.restaurants2Info),getString(R.string.restaurants2Address),getString(R.string.restaurants2Google),getString(R.string.restaurants2Call)));
        list.add(new Place (R.drawable.astiane_4,getString(R.string.restaurants4),getString(R.string.restaurants4District), getString(R.string.restaurants4Info),getString(R.string.restaurants4Address),getString(R.string.restaurants4Google),getString(R.string.restaurants4Call)));
        list.add(new Place (R.drawable.roof_16_5,getString(R.string.restaurants5),getString(R.string.restaurants5District), getString(R.string.restaurants5Info),getString(R.string.restaurants5Address),getString(R.string.restaurants5Google),getString(R.string.restaurants5Call)));
        list.add(new Place (R.drawable.sunset_6,getString(R.string.restaurants6),getString(R.string.restaurants6District), getString(R.string.restaurants6Info),getString(R.string.restaurants6Address),getString(R.string.restaurants6Google),getString(R.string.restaurants6Call)));
        list.add(new Place (R.drawable.mikla_7,getString(R.string.restaurants7),getString(R.string.restaurants7District), getString(R.string.restaurants7Info),getString(R.string.restaurants7Address),getString(R.string.restaurants7Google),getString(R.string.restaurants7Call)));
    }
}
