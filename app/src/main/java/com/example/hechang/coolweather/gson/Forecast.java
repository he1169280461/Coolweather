package com.example.hechang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

/**
 * Created by HE on 2018/4/10.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
