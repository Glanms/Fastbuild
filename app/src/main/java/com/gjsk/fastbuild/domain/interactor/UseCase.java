package com.gjsk.fastbuild.domain.interactor;

import com.gjsk.fastbuild.domain.executor.PostExecutionThread;
import com.gjsk.fastbuild.domain.executor.ThreadExecutor;

/**
 * Abstract class for a Use Case (Interactor in terms of Clean Architecture).
 * This interface represents a execution unit for different use cases (this means any use case
 * in the application should implement this contract).
 * <p/>
 * By convention each UseCase implementation will return the result using a {@link Subscriber}
 * that will execute its job in a background thread and will post the result in the UI thread.
 */
public abstract class UseCase {


    private final ThreadExecutor threadExecutor;
    private final PostExecutionThread postExecutionThread;


    public UseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }
}
