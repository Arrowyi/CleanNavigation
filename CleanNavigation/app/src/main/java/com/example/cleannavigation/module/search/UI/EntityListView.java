package com.example.cleannavigation.module.search.UI;

import com.example.cleannavigation.framework.View;
import com.example.cleannavigation.module.search.domain.Entity;

import java.util.List;

public interface EntityListView extends View {
    void onFetching();
    void EntityFetched(List<Entity> entities);
}
