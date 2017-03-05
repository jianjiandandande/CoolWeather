package com.gaowenxing.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lx on 2017/3/5.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
