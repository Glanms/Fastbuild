package com.gjsk.fastbuild.modules.login.interactor;

import com.gjsk.fastbuild.domain.executor.PostExecutionThread;
import com.gjsk.fastbuild.domain.executor.ThreadExecutor;
import com.gjsk.fastbuild.domain.interactor.UseCase;

/**
 * Created by Glanms on 16/4/6.
 */
public class LoginUseCase extends UseCase {


    public LoginUseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
    }
}
