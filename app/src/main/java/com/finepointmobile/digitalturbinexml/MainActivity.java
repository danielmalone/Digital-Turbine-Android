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
        Call<Ads> mDataset = apiService.getUser();
        mDataset.enqueue(new Callback<Ads>() {
            @Override
            public void onResponse(Call<Ads> call, Response<Ads> response) {
                Log.d(TAG, "onResponse: success!" + response);
                Ads ads = response.body();
                Log.d(TAG, "onResponse: ad: " + ads + " status code: " + response.code());
                for (int i = 0; i < ads.getAds().size(); i++) {
                    Log.d(TAG, "onResponse: successfully getting data... " + ads.getAds().get(i).getClickProxyURL());
                }
            }

            @Override
            public void onFailure(Call<Ads> call, Throwable t) {
                Log.d(TAG, "onFailure: error: " + t);
            }
        });
    }
}
