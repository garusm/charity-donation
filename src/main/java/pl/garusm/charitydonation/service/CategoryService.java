package pl.garusm.charitydonation.service;

import pl.garusm.charitydonation.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getCategories();
    void addCategory(Category category);
    Optional<Category> getCategory(Long id);
    void deleteCategory(Long id);

}
