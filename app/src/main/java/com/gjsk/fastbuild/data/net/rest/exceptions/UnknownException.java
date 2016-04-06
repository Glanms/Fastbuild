package com.gjsk.fastbuild.data.net.rest.exceptions;

/**
 * Created by Glanms on 16/4/5.
 * 未定义或未知异常
 */
public class UnknownException extends Exception {

    public UnknownException(String msg) {
        super(msg);
    }

    public UnknownException() {
        super();
    }
}
