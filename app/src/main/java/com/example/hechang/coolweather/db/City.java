package com.example.hechang.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HE on 2018/4/8.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private  int cityCode;
    private  int provinceid;

    public int getCityCode() {
        return cityCode;
    }

    public int getId() {
        return id;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}
