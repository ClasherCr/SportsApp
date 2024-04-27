package com.example.sportsapp;
//this is model class
public class Sport {
    String sportname;
    int sportImg;

    public Sport(String sportname, int sportImg) {
        this.sportname = sportname;
        this.sportImg = sportImg;
    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        this.sportname = sportname;
    }

    public int getSportImg() {
        return sportImg;
    }

    public void setSportImg(int sportImg) {
        this.sportImg = sportImg;
    }
}
