package com.gjsk.fastbuild.data.net.rest;

import com.gjsk.fastbuild.model.entities.UserModel;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by Glanms on 16/4/5.
 */
public interface UseApi {


    String BASE_URL = com.gjsk.fastbuild.FastApplication.DEBUG ? "http://ec2.amazon.cc.test"
            : "http://www.joymaker.api/";

    @GET("user/(id)")
    Observable<UserModel> getUserInfo(@Path("id") String id);
}
