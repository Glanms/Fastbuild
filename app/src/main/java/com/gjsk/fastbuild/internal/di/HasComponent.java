package com.gjsk.fastbuild.internal.di;

/**
 * Created by Glanms on 16/4/5.
 * Interface representing a contract for clients that contains a component for dependency injection.
 */
public interface HasComponent<C> {

    C getComponent();
}
