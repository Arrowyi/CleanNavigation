package com.example.cleannavigation.module.search.usecase;

import com.example.cleannavigation.framework.UseCase;
import com.example.cleannavigation.module.search.domain.Entity;
import com.example.cleannavigation.module.search.domain.SearchEngine;

import java.util.List;

public class SearchByCategoryUseCase implements UseCase<Integer, List<Entity>> {

    SearchEngine searchEngine;

    @Override
    public void execute(Integer parameter, UseCase.Callback<List<Entity>> callback) {
        List<Entity> result = searchEngine.getCategories(parameter);
        callback.onSuccess(result);
    }
}
