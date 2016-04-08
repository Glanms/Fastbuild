package com.gjsk.fastbuild.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Glanms on 16/4/5.
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化注入
        ButterKnife.bind(this);
        initInjection();
        initView();
    }

    /**
     * 初始化控件
     */
    public abstract void initView();

    /**
     * 初始化注入
     */
    public abstract void initInjection();

    /**
     * 显示默认加载界面
     */
    public void showLoading() {

    }

    /**
     * 隐藏加载界面
     */
    public void hideLoading() {

    }

    /**
     * 显示默认错误界面
     */
    public void showErrorView() {

    }

    /**
     * 隐藏错误界面
     */
    public void hideErrorView() {

    }


    public void showConfirmDialog() {
    }

}
