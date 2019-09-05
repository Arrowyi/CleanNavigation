package com.example.cleannavigation.module.search.Presenters;

import android.os.Bundle;

import com.example.cleannavigation.common.framework.BasePresenter;
import com.example.cleannavigation.framework.FlowManger;
import com.example.cleannavigation.module.search.UI.EntityListAction;
import com.example.cleannavigation.module.search.UI.EntityListView;
import com.example.cleannavigation.module.search.domain.Entity;
import com.example.cleannavigation.module.search.usecase.SearchByCategoryUseCase;

import java.util.List;

public class EntityListPresenter extends BasePresenter<EntityListView> implements SearchByCategoryUseCase.Callback<List<Entity>>, EntityListAction {


    private List<Entity> entities;

    @Override
    public void enter(Bundle parameter) {
        int catogery = parameter.getInt("catogery");
        getView().onFetching();
        SearchByCategoryUseCase searchByCategoryUseCase = new SearchByCategoryUseCase();
        searchByCategoryUseCase.execute(catogery, this);
    }

    @Override
    public void exit() {

    }

    @Override
    public FlowManger getFlowManager() {
        return null;
    }

    @Override
    public void onSuccess(List<Entity> entities) {
        this.entities = entities;
        getView().EntityFetched(entities);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void showEntityDetails(int index) {
        Entity entity = entities.get(index);
        getFlowManager().startFlow("EntityDetails", new Bundle());
    }
}
