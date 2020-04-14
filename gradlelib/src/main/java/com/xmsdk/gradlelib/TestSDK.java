package com.xmsdk.gradlelib;

import android.app.Activity;
import android.content.Intent;

import okhttp3.OkHttpClient;

/**
 * @author wujunfeng
 * @description
 * @date 2020/4/9.
 */
public class TestSDK {

    private static TestSDK instance;

    private TestSDK(){

    }

    public static TestSDK getInstance() {
        if (instance == null){
            instance = new TestSDK();
        }
        return instance;
    }

    public void login(Activity activity){
        Intent intent = new Intent();
        intent.setClass(activity, LoginActivity.class);
        activity.startActivity(intent);
        OkHttpClient client = new OkHttpClient();
    }

    public void pay(Activity activity){
        Intent intent = new Intent();
        intent.setClass(activity, PayActivity.class);
        activity.startActivity(intent);
    }


}
