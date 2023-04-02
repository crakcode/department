package forum.department.service;

import forum.department.domain.Category;
import forum.department.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public void saveCategory(Category category){
        categoryRepository.save(category);
    }

    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }



}
