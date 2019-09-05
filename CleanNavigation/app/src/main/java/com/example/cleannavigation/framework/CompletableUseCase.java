package com.example.cleannavigation.framework;

public interface CompletableUseCase<P> {

    interface Callback {
        void onSuccess();
        void onError(Throwable throwable);
    }

    void execute(P parameter, Callback callback);
}
