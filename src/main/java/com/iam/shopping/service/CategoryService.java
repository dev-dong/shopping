package com.iam.shopping.service;

import com.iam.shopping.domain.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> categoryList(int paramNum);
    public void categoryInsert(Category category);
}
