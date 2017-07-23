package com.finepointmobile.digitalturbinexml;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by danielmalone on 7/23/17.
 */

public class DetailView extends AppCompatActivity {

    private static final String TAG = "DetailView";

    TextView mName;
    TextView mCategory;
    TextView mDescription;
    ImageView mImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        mName = (TextView) findViewById(R.id.name);
        mCategory = (TextView) findViewById(R.id.category);
        mDescription = (TextView) findViewById(R.id.description);
        mImage = (ImageView) findViewById(R.id.image);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String category = intent.getStringExtra("category");
        String description = intent.getStringExtra("description");
        String image = intent.getStringExtra("image");
        Log.d(TAG, "onCreate: name: " + name);

        mName.setText(name);
        mCategory.setText(category);
        mDescription.setText(description);
        Picasso.with(this).load(image).into(mImage);
    }
}
