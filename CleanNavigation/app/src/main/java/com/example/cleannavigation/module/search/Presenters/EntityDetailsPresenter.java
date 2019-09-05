package com.example.cleannavigation.module.search.Presenters;

import android.os.Bundle;

import com.example.cleannavigation.common.framework.BasePresenter;
import com.example.cleannavigation.module.search.UI.EntityDetailsAction;
import com.example.cleannavigation.module.search.UI.EntityDetailsView;
import com.example.cleannavigation.module.search.domain.Entity;
import com.example.cleannavigation.module.search.domain.EntityDetail;
import com.example.cleannavigation.module.search.usecase.GetEntityDetailsUseCase;

public class EntityDetailsPresenter extends BasePresenter<EntityDetailsView> implements GetEntityDetailsUseCase.Callback<EntityDetail>, EntityDetailsAction {

    @Override
    public void enter(Bundle parameter) {
        super.enter(parameter);

        getView().onFetching();

        GetEntityDetailsUseCase getEntityDetailsUseCase = new GetEntityDetailsUseCase();
        getEntityDetailsUseCase.execute(new Entity(), this);
    }

    @Override
    public void onSuccess(EntityDetail entityDetail) {
        getView().DetailsFetched(entityDetail);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void doNavigation() {

    }
}
