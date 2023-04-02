package forum.department.service;

import forum.department.domain.Category;
import forum.department.domain.Mentee;
import forum.department.dto.MenteeDTO;
import forum.department.repository.MenteeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenteeService {

    @Autowired
    private MenteeRepository menteeRepository;

    @Autowired
    private CategoryService categoryService;


    public void createMentee(MenteeDTO menteeDTO){
        Mentee mentee=new Mentee();
        Category category=categoryService.findById(menteeDTO.getCategory_id()).get();
        mentee.setCategory(category);
        mentee.setEmail(menteeDTO.getEmail());
        mentee.setName(menteeDTO.getName());
        mentee.setPhone(menteeDTO.getPhone());
        menteeRepository.save(mentee);
    }



}
