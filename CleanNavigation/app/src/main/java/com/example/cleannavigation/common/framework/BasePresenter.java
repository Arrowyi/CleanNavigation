package com.example.cleannavigation.common.framework;

import android.os.Bundle;

import com.example.cleannavigation.framework.Action;
import com.example.cleannavigation.framework.FlowManger;
import com.example.cleannavigation.framework.Presenter;
import com.example.cleannavigation.framework.View;

public class BasePresenter<T extends View> implements Presenter<T>, Action {

    private T view;

    public BasePresenter(T view) {
        this.view = view;
    }

    public BasePresenter() {
    }

    @Override
    public void enter(Bundle parameter) {

    }

    @Override
    public void active() {
        getView().show();
    }

    @Override
    public void deactive() {
        getView().hide();
    }

    @Override
    public void exit() {

    }

    @Override
    public FlowManger getFlowManager() {
        return null;
    }

    @Override
    public T getView() {
        if (view == null) {
            throw new RuntimeException("no view in " + this.getClass().getName());
        }
        return view;
    }

    @Override
    public void goBackground() {
        getFlowManager().goBackground();
    }

    @Override
    public void goForeground() {
        getFlowManager().goForeground();
    }
}
