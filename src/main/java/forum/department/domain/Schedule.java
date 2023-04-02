package forum.department.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Schedule {

    @Id
    @GeneratedValue
    @Column(name="schedule_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="mentee_id")
    private Mentee mentee;

    @ManyToOne
    @JoinColumn(name="mentor_id")
    private Mentor mentor;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private ScheduleStatus status;

}
