package com.example.cats;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHandler {
    private Retrofit retrofit;
    private String BaseUrl="http://developer.alexanderklimov.ru/";
    private ApiHandler mInstance;

    public ApiHandler(){
        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client=new OkHttpClient.Builder().addInterceptor(interceptor);
        retrofit=new Retrofit.Builder().baseUrl(BaseUrl).client(client.build()).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public ApiHandler getmInstance(){
        if(mInstance==null){
            return mInstance=new ApiHandler();
        }
        else {
            return mInstance;
        }
    }
    public IAPI getService(){
        return retrofit.create(IAPI.class);

    }

}
