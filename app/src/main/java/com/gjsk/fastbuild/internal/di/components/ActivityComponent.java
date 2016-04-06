package com.gjsk.fastbuild.internal.di.components;


import com.gjsk.fastbuild.internal.di.modules.ActivityModule;
import com.gjsk.fastbuild.modules.launch.WelcomeActivity;
import com.gjsk.fastbuild.modules.login.activity.LoginActivity;
import com.gjsk.fastbuild.modules.main.MainActivity;

import dagger.Component;

/**
 * Created by Glanms on 16/4/5.
 */
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(WelcomeActivity welcomeActivity);

    void inject(LoginActivity loginActivity);
}


