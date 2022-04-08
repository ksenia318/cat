package com.example.cats;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IAPI {
    @GET("/android/apk/cats.json")
    Call<MyResponce> getResponce();
}
