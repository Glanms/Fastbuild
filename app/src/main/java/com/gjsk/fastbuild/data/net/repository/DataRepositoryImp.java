package com.gjsk.fastbuild.data.net.repository;

import com.gjsk.fastbuild.domain.respository.DataRepository;
import com.gjsk.fastbuild.model.entities.UserModel;

import rx.Observable;

/**
 * Created by Glanms on 16/4/5.
 */
public class DataRepositoryImp implements DataRepository {


    public DataRepositoryImp() {

    }

    @Override
    public Observable<UserModel> getUserInfo(long userId) {
        return null;
    }
}
