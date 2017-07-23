package com.finepointmobile.digitalturbinexml;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by danielmalone on 7/22/17.
 */

public interface ApiServiceInterface {
    @GET("getAds?id=236&password=OVUJ1DJN&siteId=4288&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10")
    Call<Ad> getUser();
}
