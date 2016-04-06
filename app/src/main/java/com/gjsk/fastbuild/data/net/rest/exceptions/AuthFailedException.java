package com.gjsk.fastbuild.data.net.rest.exceptions;

/**
 * Created by Glanms on 16/4/5.
 * 认证失败异常
 */
public class AuthFailedException extends Exception {

    public AuthFailedException(String msg) {
        super(msg);
    }

    public AuthFailedException() {
        super();
    }
}
