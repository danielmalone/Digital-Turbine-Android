package com.finepointmobile.digitalturbinexml;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private static final String API_BASE_URL = "http://ads.appia.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        ApiServiceInterface apiService = retrofit.create(ApiServiceInterface.class);
        Call<Ad> mDataset = apiService.getUser();
        mDataset.enqueue(new Callback<Ad>() {
            @Override
            public void onResponse(Call<Ad> call, Response<Ad> response) {
                Log.d(TAG, "onResponse: success!" + response);
                Ad ad = response.body();
                Log.d(TAG, "onResponse: ad: " + ad);
            }

            @Override
            public void onFailure(Call<Ad> call, Throwable t) {
                Log.d(TAG, "onFailure: error: " + t);
            }
        });
    }
}
