package com.example.geographicaltreasure;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by 翟力 on 2017/1/4.
 */

public class TreasureApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
    }
}
