package com.example.cleannavigation.framework;

public interface UseCase<P, R> {

    interface Callback<R> {
        void onSuccess(R r);
        void onError(Throwable throwable);
    }

    void execute(P parameter, Callback<R> callback);
}
