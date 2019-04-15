package cn.xports.test;

import android.app.Application;

import cn.xports.autoviews.util.AutoUtil;

/**
 * Created by qianxin on 2017/12/18.
 */

public class HandHeldApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AutoUtil.with(this)
                .setDesignHeight(667)
                .setDesignWidth(375)
                .init();
    }
}
