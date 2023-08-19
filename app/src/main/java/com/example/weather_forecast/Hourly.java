package com.example.weather_forecast;

public class Hourly {
    private  String hour;
    private  String temp;
    private  String picPath;

    public Hourly(String hour, int temp, String picPath) {
        this.hour = hour;
        temp = temp;
        this.picPath = picPath;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
