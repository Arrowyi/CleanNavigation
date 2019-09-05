package com.example.cleannavigation.module.category.Presenters;

import android.os.Bundle;

import com.example.cleannavigation.common.framework.BasePresenter;
import com.example.cleannavigation.framework.FlowManger;
import com.example.cleannavigation.module.category.UI.CategoriesAction;
import com.example.cleannavigation.module.category.UI.CategoriesView;
import com.example.cleannavigation.module.category.domain.Category;

public class CategoriesPresenter extends BasePresenter<CategoriesView> implements CategoriesAction {

    @Override
    public void enter(Bundle parameter) {
        getView().showCategories();
    }

    @Override
    public void exit() {

    }

    @Override
    public FlowManger getFlowManager() {
        return null;
    }


    @Override
    public void onCategoryClick(Category category)
    {
        getFlowManager().startFlow("category", new Bundle());
    }
}
