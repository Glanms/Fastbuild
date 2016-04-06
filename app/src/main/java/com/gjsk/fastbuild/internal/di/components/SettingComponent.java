package com.gjsk.fastbuild.internal.di.components;

import com.gjsk.fastbuild.internal.di.modules.SettingModule;

import dagger.Component;

/**
 * Created by Glanms on 16/4/5.
 */
@Component(dependencies = ActivityComponent.class,modules = SettingModule.class)
public interface SettingComponent {

}
