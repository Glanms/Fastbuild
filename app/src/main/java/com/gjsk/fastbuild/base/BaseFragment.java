package com.gjsk.fastbuild.base;

import android.content.Intent;

/**
 * Created by Glanms on 16/4/5.
 */
public abstract class BaseFragment extends android.support.v4.app.Fragment {


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


}
