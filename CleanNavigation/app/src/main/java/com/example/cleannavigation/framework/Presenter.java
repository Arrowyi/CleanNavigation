package com.example.cleannavigation.framework;

import android.os.Bundle;

public interface Presenter<T extends View> {
    void enter(Bundle parameter);
    void active();
    void deactive();
    void exit();
    FlowManger getFlowManager();
    T getView();
}
