package forum.department.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Board {

    @Id
    @GeneratedValue
    @Column(name="board_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="mentee_id")
    private Mentee mentee;

    @ManyToOne
    @JoinColumn(name="mentor_id")
    private Mentor mentor;

    private String title;

    private String content;

    private LocalDateTime orderDate;

    private int count;


}
