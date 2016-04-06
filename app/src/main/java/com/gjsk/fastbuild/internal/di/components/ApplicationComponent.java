package com.gjsk.fastbuild.internal.di.components;

import com.gjsk.fastbuild.FastApplication;
import com.gjsk.fastbuild.internal.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Glanms on 16/4/5.
 * 全局Component
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent extends Component {

    void inject(FastApplication fastApplication);

}
