package com.finepointmobile.digitalturbinexml;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by danielmalone on 7/23/17.
 */

public class DetailView extends AppCompatActivity {

    TextView mName;
    TextView mCategory;
    TextView mDescription;
    ImageView mImage;
    TextView mMinOsVersion;
    TextView mNumberOfRatings;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        mName = (TextView) findViewById(R.id.name);
        mCategory = (TextView) findViewById(R.id.category);
        mDescription = (TextView) findViewById(R.id.description);
        mImage = (ImageView) findViewById(R.id.image);
        mMinOsVersion = (TextView) findViewById(R.id.min_os_version);
        mNumberOfRatings = (TextView) findViewById(R.id.number_of_ratings);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String category = intent.getStringExtra("category");
        String description = intent.getStringExtra("description");
        String image = intent.getStringExtra("image");
        String min_os_version = intent.getStringExtra("min_os_version");
        String number_of_ratings = intent.getStringExtra("number_of_ratings");

        mName.setText(name);
        mCategory.setText(category);
        mDescription.setText(description);
        mMinOsVersion.setText(min_os_version);
        mNumberOfRatings.setText(number_of_ratings);
        Picasso.with(this).load(image).into(mImage);
    }
}
