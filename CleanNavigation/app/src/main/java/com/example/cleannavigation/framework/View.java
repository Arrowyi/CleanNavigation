package com.example.cleannavigation.framework;

public interface View<T extends Action>{
    void show();
    void hide();
    T getAction();
}
