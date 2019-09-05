package com.example.cleannavigation.framework;

import android.os.Bundle;
import android.util.Pair;

import java.util.List;
import java.util.Stack;

public class FlowManger {

    Stack<Presenter> Presenters;

    public void registerFlow(String name, Presenter presenter) {

    }

    public void registrerPresneters(List<Pair<String, Presenter>> presenters) {

    }

    public void goBackground() {
        Presenter presenter = Presenters.peek();
        if (presenter != null) {
            presenter.deactive();
        }

    }

    public void goForeground() {
        Presenter presenter = Presenters.peek();
        if (presenter != null) {
            presenter.active();
        }
    }


    public void startFlow(String toFlowName, Bundle paramater) {
        Presenter toPresenter = getPresenter(toFlowName);
        Presenter currentPresenter = Presenters.peek();
        if (currentPresenter != null) {
            currentPresenter.deactive();
        }

        toPresenter.enter(paramater);
        toPresenter.active();
        Presenters.push(toPresenter);
    }

    public void back() {
        Presenter currentPresenter = Presenters.pop();
        currentPresenter.deactive();
        currentPresenter.exit();

        Presenter prePresenter = Presenters.peek();
        prePresenter.active();
    }

    private boolean checkExit(String name) {
        return true;
    }

    private Presenter getPresenter(String name) {
        if (!checkExit(name)) {
            throw new RuntimeException("flow couldn't find");
        }

        return null;

    }
}
