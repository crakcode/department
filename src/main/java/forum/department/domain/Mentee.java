package forum.department.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Mentee {


    @Id @GeneratedValue
    @Column(name="mentee_id")
    private Long id;

    private String name;

    @OneToOne(fetch = LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="category_id")
    private Category category;

    private String email;

    private String password;

    private int phone;


}
