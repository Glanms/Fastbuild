package com.gjsk.fastbuild.utils.graph;

import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;

/**
 * Created by Glanms on 16/4/5.
 * 常用的动画类
 */
public class AnimationUtils {

    /**
     * 设置淡入淡出动画
     *
     * @param fromAlpha
     * @param toAlpha
     * @param duration
     */
    public static void setAlphaAnim(float fromAlpha, float toAlpha, long duration) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(fromAlpha, toAlpha);
        alphaAnimation.setDuration(duration);
        alphaAnimation.setInterpolator(new LinearInterpolator());

    }


}
