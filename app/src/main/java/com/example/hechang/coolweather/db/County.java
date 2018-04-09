package com.example.hechang.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HE on 2018/4/8.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private  String weatherId;
    private  int cityid;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCityid() {
        return cityid;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCityid(int cityid) {
        this.cityid=cityid;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
