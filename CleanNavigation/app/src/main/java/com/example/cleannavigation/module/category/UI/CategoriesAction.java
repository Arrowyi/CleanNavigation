package com.example.cleannavigation.module.category.UI;

import com.example.cleannavigation.framework.Action;
import com.example.cleannavigation.module.category.domain.Category;

public interface CategoriesAction extends Action {
    void onCategoryClick(Category category);
}
