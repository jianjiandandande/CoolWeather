package com.gaowenxing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lx on 2017/3/5.
 */

/**
 * 由于GSON中一些字段不适合用java语言来命名，这里使用@SerializedName
 * 注解的方式使得GSON字段与java字段之间产生一种映射
 */

public class Basic {
    @SerializedName("city")//城市名
    public String cityName;

    @SerializedName("id")//代表天气的id
    public String weatherId;

    public Update update;


    public class Update{
        @SerializedName("loc")//表示天气更新的时间
        public String updateTime;
    }
}
