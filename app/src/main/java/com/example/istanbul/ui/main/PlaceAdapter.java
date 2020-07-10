package com.example.istanbul.ui.main;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istanbul.R;

import java.util.ArrayList;

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
        Place currentPlace = getItem(position);

        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getmImageID());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        placeName.setText(currentPlace.getmPlaceName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeDistrict = (TextView) listItemView.findViewById(R.id.place_district);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        placeDistrict.setText(currentPlace.getmDistrict());


        TextView placeInfo = (TextView) listItemView.findViewById(R.id.place_info);
        placeInfo.setText(currentPlace.getmInformation());

        TextView placeAdress = (TextView) listItemView.findViewById(R.id.place_address);
        placeAdress.setText(currentPlace.getmAddress());





       /* // has image is false for phrases activity
        if (currentWord.hasImage()){
        imageView.setImageResource(currentWord.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);
        } else {
        imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorRecourseId);
        //setting color
        textContainer.setBackgroundColor(color);*/

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}