package com.example.weather_forecast;

public class FutureDomain {
    private String day;
    private String picPath;
    private String status;
    private int highTemp;
    private int lomTemp;

    public FutureDomain(String day, String picPath, String status, int highTemp, int lomTemp) {
        this.day = day;
        this.picPath = picPath;
        this.status = status;
        this.highTemp = highTemp;
        this.lomTemp = lomTemp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLomTemp() {
        return lomTemp;
    }

    public void setLomTemp(int lomTemp) {
        this.lomTemp = lomTemp;
    }
}
