package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category addCategory(Category category);

    void deleteCategoryById(Long id);
}
