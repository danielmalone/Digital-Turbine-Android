package com.finepointmobile.digitalturbinexml;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by danielmalone on 7/23/17.
 */

public class DetailView extends AppCompatActivity {

    private static final String TAG = "DetailView";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, "onCreate: name: " + name);
    }
}
