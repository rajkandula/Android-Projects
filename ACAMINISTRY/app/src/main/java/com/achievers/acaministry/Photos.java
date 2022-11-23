package com.achievers.acaministry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;




public class Photos extends Fragment {

    Gallery simpleGallery;

    // CustomizedGalleryAdapter is a java class which extends BaseAdapter
    // and implement the override methods.
    CustomizedGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;

    // To show the selected language, we need this
    // array of images, here taken 10 different kind of most popular programming langages
    int[] images = {R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3, R.drawable.photo_4, R.drawable.photo_5,
            R.drawable.photo_6, R.drawable.photo_7, R.drawable.photo_8, R.drawable.photo_9, R.drawable.photo_10,R.drawable.photo_11, R.drawable.photo_12, R.drawable.photo_13, R.drawable.photo_14, R.drawable.photo_15,
            R.drawable.photo_16, R.drawable.photo_17, R.drawable.photo_18, R.drawable.photo_19, R.drawable.photo_20,R.drawable.photo_21, R.drawable.photo_22};



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate (R.layout.activity_gallery,container,false);


        // Our layout is activity_main
        // get the reference of Gallery. As we are showing languages it is named as languagesGallery
        // meaningful names will be good for easier understanding
        simpleGallery = (Gallery)view.findViewById(R.id.languagesGallery);

        // get the reference of ImageView
        selectedImageView = (ImageView)view.findViewById(R.id.imageView);


        // initialize the adapter
        customGalleryAdapter = new CustomizedGalleryAdapter(getActivity(), images);

        // set the adapter for gallery
        simpleGallery.setAdapter(customGalleryAdapter);

        //by default select potion of image
        selectedImageView.setImageResource(images[0]);

        // Let us do item click of gallery and image can be identified by its position
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Whichever image is clicked, that is set in the selectedImageView
                // position will indicate the location of image
                selectedImageView.setImageResource(images[position]);
            }
        });

        return view;
    }

}
