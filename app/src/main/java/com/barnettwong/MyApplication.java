package com.barnettwong;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

public class MyApplication extends Application {

    private static MyApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    public static Context getAppContext() {
        return baseApplication;
    }
    public static Resources getAppResources() {
        return baseApplication.getResources();
    }
}
