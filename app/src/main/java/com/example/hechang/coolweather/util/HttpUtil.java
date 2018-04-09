package com.example.hechang.coolweather.util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by HE on 2018/4/8.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        /*
        在子线程中执行HTTP请求并把结果回调到okhttp3.Callback中
         */
        client.newCall(request).enqueue(callback);
    }
}
