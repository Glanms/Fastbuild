package com.gjsk.fastbuild.modules.main;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.gjsk.fastbuild.utils.common.BaseToast;
import com.gjsk.fastbuild.utils.common.LogHelper;

/**
 * Created by Glanms on 16/4/8.
 * Base service class
 */
public class IService extends Service {

    private static final String TAG = "IService";

    @Override
    public void onCreate() {
        LogHelper.d(TAG, "onCreate");

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        LogHelper.d(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        LogHelper.d(TAG, "onBind");

        return myBindler;
    }

    @Override
    public void onDestroy() {
        LogHelper.d(TAG, "onDestroy");

        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogHelper.d(TAG, "onUnbind");

        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        LogHelper.d(TAG, "onRebind");

        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        LogHelper.d(TAG, "onTaskRemoved");

        super.onTaskRemoved(rootIntent);
    }

    /**
     * 对外提供的方法
     */
    public void sayHello(String name) {
        BaseToast.showShort(this, String.format("Hello 1$%s ,It's IService.", name));
    }


    public class MyBindler extends Binder {

        public IService getService() {

            return IService.this;
        }


    }

    private MyBindler myBindler = new MyBindler();
}
