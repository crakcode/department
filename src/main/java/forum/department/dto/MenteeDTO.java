package forum.department.dto;

import forum.department.domain.Category;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MenteeDTO {
    private Long id;

    private String name;

    private Long category_id;

    private String email;

    private String password;

    private int phone;

}
