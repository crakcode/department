package forum.department.service;

import forum.department.domain.Category;
import forum.department.domain.Mentee;
import forum.department.domain.Mentor;
import forum.department.dto.MenteeDTO;
import forum.department.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private CategoryService categoryService;


    public void createMentee(MenteeDTO menteeDTO){
        Mentor mentor=new Mentor();
        Category category=categoryService.findById(menteeDTO.getCategory_id()).get();
        mentor.setCategory(category);
        mentor.setEmail(menteeDTO.getEmail());
        mentor.setName(menteeDTO.getName());
        mentor.setPhone(menteeDTO.getPhone());
        mentorRepository.save(mentor);
    }



}
