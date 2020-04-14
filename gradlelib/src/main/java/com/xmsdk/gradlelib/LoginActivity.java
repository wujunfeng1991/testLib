package com.xmsdk.gradlelib;

import android.app.Activity;
import android.os.Bundle;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int identifier = getResources().getIdentifier("activity_login", "layout", getPackageName());
        setContentView(identifier);
    }
}
