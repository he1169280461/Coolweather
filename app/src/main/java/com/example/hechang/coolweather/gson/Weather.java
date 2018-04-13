package com.example.hechang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HE on 2018/4/10.
 */

public class Weather {
    public String status;
    public AQI aqi;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
