package com.example.cats;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("mobile")
    String mobile;
    @SerializedName("email")
    String email;
    @SerializedName("skype")
    String skype;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
}
