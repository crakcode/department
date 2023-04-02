package forum.department.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Reply {
    @Id
    @GeneratedValue
    @Column(name="reply_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="mentee_id")
    private Mentee mentee;

    @ManyToOne
    @JoinColumn(name="mentor_id")
    private Mentor mentor;

    private String message;

    private LocalDateTime orderDate;

}
