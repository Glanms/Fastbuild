package com.gjsk.fastbuild.data.net.rest;

import com.gjsk.fastbuild.model.entities.UserModel;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by Glanms on 16/4/5.
 * 用于获取全局配置
 */
public interface ConfigApi {

    String BASE_URL = com.gjsk.fastbuild.FastApplication.DEBUG ? "http://ec2.amazon.sd.test"
            : "http://www.joymaker.api/";

    @GET("common/config")
    Observable<UserModel> getConfig();
}
