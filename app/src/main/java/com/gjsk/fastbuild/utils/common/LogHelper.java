package com.gjsk.fastbuild.utils.common;

import android.util.Log;

/**
 * Created by Glanms on 16/4/5.
 * 日志打印封装类
 */
public class LogHelper {

    public static boolean LOG_DEBUG = true;

    // 控制Log 是否打印信息
    public static void print(String msg) {
        if (LOG_DEBUG)
            System.out.println(msg);
    }

    public static void e(String tag, String msg) {
        if (LOG_DEBUG)
            Log.e(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (LOG_DEBUG)
            Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (LOG_DEBUG)
            Log.i(tag, tag);
    }

    public static void w(String tag, String msg) {
        if (LOG_DEBUG)
            Log.w(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (LOG_DEBUG)
            Log.v(tag, msg);
    }



}
