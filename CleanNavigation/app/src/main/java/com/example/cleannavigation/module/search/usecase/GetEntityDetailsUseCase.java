package com.example.cleannavigation.module.search.usecase;

import com.example.cleannavigation.framework.UseCase;
import com.example.cleannavigation.module.search.domain.Entity;
import com.example.cleannavigation.module.search.domain.EntityDetail;
import com.example.cleannavigation.module.search.domain.SearchEngine;

public class GetEntityDetailsUseCase implements UseCase<Entity, EntityDetail> {

    SearchEngine searchEngine;
    @Override
    public void execute(Entity parameter, Callback<EntityDetail> callback) {
        EntityDetail entityDetail = searchEngine.getDetails(parameter);
        callback.onSuccess(entityDetail);
    }
}
