package com.gjsk.fastbuild;

import android.app.Application;

import com.gjsk.fastbuild.utils.common.LogHelper;

/**
 * Created by Glanms on 16/4/5.
 */
public class FastApplication extends Application {

    public static boolean DEBUG = false;  // 全局Log开关

    @Override
    public void onCreate() {
        super.onCreate();
        LogHelper.LOG_DEBUG = true; // 控制调试开关
    }


}
