package com.example.cats;

import com.google.gson.annotations.SerializedName;

public class ImageResponce {
    @SerializedName("name")
    String Name;
    @SerializedName("city")
    String City;
    @SerializedName("contact")
    Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

}
