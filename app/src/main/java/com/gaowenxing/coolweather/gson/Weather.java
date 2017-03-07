package com.gaowenxing.coolweather.gson;

import android.content.Loader;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lx on 2017/3/5.
 */

public class Weather {
    public String status;//天气数据返回的状态
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;//Forecast是一个数组
}
