package com.example.istanbul.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istanbul.R;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class PlaceAdapter extends ArrayAdapter<Place> {

private int mColorRecourseId;

    public PlaceAdapter(Activity context, ArrayList<Place> words, int mColorRecourseId) {
        // Use this constructor to change list item background color.
        super(context, 0, words);
        this.mColorRecourseId = mColorRecourseId;
    }

    public PlaceAdapter(Activity context, ArrayList<Place> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Place currentPlace = getItem(position);

        ImageView placeImage = listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getImageID());

        TextView placeName = listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeDistrict = listItemView.findViewById(R.id.place_district);
        placeDistrict.setText(currentPlace.getDistrict());

        TextView placeInfo = listItemView.findViewById(R.id.place_info);
        placeInfo.setText(currentPlace.getInformation());

        TextView placeAddress =  listItemView.findViewById(R.id.place_address);
        placeAddress.setText(currentPlace.getAddress());
        placeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri googleIntentUri = Uri.parse(currentPlace.getGoogleGeo());
                Intent googleMapIntent = new Intent(Intent.ACTION_VIEW, googleIntentUri);
                getContext().startActivity(googleMapIntent);

            }
        });

        return listItemView;
    }

}