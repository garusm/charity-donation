package pl.garusm.charitydonation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.garusm.charitydonation.entity.Category;
import pl.garusm.charitydonation.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaCategoryService implements CategoryService{

    private final CategoryRepository categoryRepository;

    public JpaCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Optional<Category> getCategory(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
