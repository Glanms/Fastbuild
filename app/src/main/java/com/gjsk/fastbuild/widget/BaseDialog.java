package com.gjsk.fastbuild.widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Glanms on 16/4/5.
 * 基本的对话框
 */
public class BaseDialog extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = new View(inflater.getContext());


        return v;
    }

    //对外进行赋值操作
    public void setValue() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
