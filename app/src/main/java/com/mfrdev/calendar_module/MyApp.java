package com.mfrdev.calendar_module;

import android.app.Application;

import com.yariksoffice.lingver.Lingver;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Lingver.init(this, "ar");
        Lingver.getInstance().setLocale(getApplicationContext(),"ar");
    }
}
