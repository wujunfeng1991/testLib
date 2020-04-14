package com.xmsdk.gradlelib;

import android.app.Activity;
import android.os.Bundle;

public class PayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int identifier = getResources().getIdentifier("activity_pay", "layout", getPackageName());
        setContentView(identifier);
    }
}
