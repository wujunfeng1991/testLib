package com.xmsdk.gradlelib;

import android.app.Activity;
import android.content.Intent;

/**
 * @author wujunfeng
 * @description
 * @date 2020/4/9.
 */
public class TestSDK {

    private TestSDK instance;

    private TestSDK(){

    }

    public TestSDK getInstance() {
        if (instance == null){
            instance = new TestSDK();
        }
        return instance;
    }

    public void login(Activity activity){
        Intent intent = new Intent();
        intent.setClass(activity, LoginActivity.class);
        activity.startActivity(intent);
    }

    public void pay(Activity activity){
        Intent intent = new Intent();
        intent.setClass(activity, PayActivity.class);
        activity.startActivity(intent);
    }


}
