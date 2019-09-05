package com.example.cleannavigation.module.search.UI;

import com.example.cleannavigation.framework.View;
import com.example.cleannavigation.module.search.domain.EntityDetail;

public interface EntityDetailsView extends View {
    void onFetching();
    void DetailsFetched(EntityDetail entityDetail);
}
