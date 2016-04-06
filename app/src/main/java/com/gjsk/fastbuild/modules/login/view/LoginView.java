package com.gjsk.fastbuild.modules.login.view;

import com.gjsk.fastbuild.base.LoadDataView;
import com.gjsk.fastbuild.model.entities.UserModel;

/**
 * Created by Glanms on 16/4/5.
 */
public interface LoginView extends LoadDataView {

    /**
     * 登录成功
     * @param user
     */
    void loginSuccess(UserModel user);

    /**
     * 登录失败
     * @param cause
     */
    void loginFailed(String cause);

}
