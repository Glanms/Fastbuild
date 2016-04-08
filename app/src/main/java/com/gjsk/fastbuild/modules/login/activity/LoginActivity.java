package com.gjsk.fastbuild.modules.login.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Button;

import com.gjsk.fastbuild.R;
import com.gjsk.fastbuild.base.BaseActivity;
import com.gjsk.fastbuild.modules.main.IService;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Glanms on 16/4/5.
 */
public class LoginActivity extends BaseActivity {

    @Bind(R.id.btn_start)
    Button btnStart;
    @Bind(R.id.btn_bind)
    Button btnBind;
    @Bind(R.id.btn_unbind)
    Button btnUnbind;
    @Bind(R.id.btn_stop)
    Button btnStop;

    private ServiceConnection conn;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public void initView() {

        conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                IService.MyBindler mBinder = (IService.MyBindler) service;
                IService iService = mBinder.getService();
                iService.sayHello("Li Ming");
                flag = true;
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
    }

    @Override
    public void initInjection() {

    }


    @OnClick(R.id.btn_start)
    void clickStartService() {
        Intent i = new Intent(this, IService.class);
        startService(i);
    }

    @OnClick(R.id.btn_bind)
    void clickBindService() {
        Intent i = new Intent(this, IService.class);
        if (flag) {
            bindService(i, conn, Context.BIND_AUTO_CREATE);
        }
    }

    @OnClick(R.id.btn_stop)
    void clickStopService() {
        Intent i = new Intent(this, IService.class);
        stopService(i);
    }

    @OnClick(R.id.btn_unbind)
    void clickUnbindService() {
        Intent i = new Intent(this, IService.class);
        unbindService(conn);
    }
}
