package com.example.cats;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MyResponce {
    @SerializedName("cats")
    private ArrayList<ImageResponce> data=new ArrayList<>();

    public ArrayList<ImageResponce> getData() {
        return data;
    }

    public void setData(ArrayList<ImageResponce> data) {
        this.data = data;
    }
}
