package forum.department.service;

import forum.department.domain.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class CategoryServiceTest {



    @Autowired
    public CategoryService categoryService;

    @Test
    @Rollback(value=false)
    public void 카테고리_넣기(){
        String name="기술 ";
        int code=1;
        Category category=new Category();
        category.setName(name);
        category.setCode(code);

        categoryService.saveCategory(category);
    }


}