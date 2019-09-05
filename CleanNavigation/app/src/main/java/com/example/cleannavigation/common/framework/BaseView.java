package com.example.cleannavigation.common.framework;

import com.example.cleannavigation.framework.Action;
import com.example.cleannavigation.framework.View;

public class BaseView<T extends Action> implements View<T> {

    T action;

    public BaseView(T p)
    {
        action = p;
    }

    public BaseView() {
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public T getAction() {
        if(action == null)
        {
            throw new RuntimeException("no action in " + this.getClass().getName());
        }

        return action;
    }
}
