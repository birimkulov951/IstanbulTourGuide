package com.example.istanbul.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.istanbul.R;
import com.example.istanbul.ui.main.Place;
import com.example.istanbul.ui.main.PlaceAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PlacesFragment extends Fragment {

    ArrayList<Place> list;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of words
        fillData();

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView  textView = view.findViewById(R.id.place_info);
                TextView  textView2 = view.findViewById(R.id.place_address);
                ImageView imageView = view.findViewById(R.id.info_image);
                ImageView imageView2 = view.findViewById(R.id.location_image);
                //if (/*textView != null &&*/ textView2 != null /*&& imageView != null && imageView2 != null*/) {
                    textView.setVisibility(textView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                    textView2.setVisibility(textView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                    imageView.setVisibility(imageView.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                    imageView2.setVisibility(imageView2.getVisibility()==View.VISIBLE ? View.GONE : View.VISIBLE);
                //}
            }
        });

        return rootView;
    }

    public void fillData(){
        list = new ArrayList<>();
        list.add(new Place (R.drawable.hagi_sophia,getString(R.string.topPlaces1),getString(R.string.topPlaces1District), getString(R.string.topPlaces1Info),getString(R.string.topPlaces1Address),getString(R.string.topPlaces1Google)));
        list.add(new Place (R.drawable.blue_mosque,getString(R.string.topPlaces2),getString(R.string.topPlaces2District), getString(R.string.topPlaces2Info),getString(R.string.topPlaces2Address),getString(R.string.topPlaces2Google)));
        list.add(new Place (R.drawable.topkapi,getString(R.string.topPlaces3),getString(R.string.topPlaces3District), getString(R.string.topPlaces3Info),getString(R.string.topPlaces3Address),getString(R.string.topPlaces3Google)));
        list.add(new Place (R.drawable.grand_bazaar,getString(R.string.topPlaces4),getString(R.string.topPlaces4District), getString(R.string.topPlaces4Info),getString(R.string.topPlaces4Address),getString(R.string.topPlaces4Google)));
        list.add(new Place (R.drawable.suleymaniye,getString(R.string.topPlaces5),getString(R.string.topPlaces5District), getString(R.string.topPlaces5Info),getString(R.string.topPlaces5Address),getString(R.string.topPlaces5Google)));
        list.add(new Place (R.drawable.dolmabahce_palace,getString(R.string.topPlaces6),getString(R.string.topPlaces6District), getString(R.string.topPlaces6Info),getString(R.string.topPlaces6Address),getString(R.string.topPlaces6Google)));
        list.add(new Place (R.drawable.basilica,getString(R.string.topPlaces7),getString(R.string.topPlaces7District), getString(R.string.topPlaces7Info),getString(R.string.topPlaces7Address),getString(R.string.topPlaces7Google)));
    }
}
