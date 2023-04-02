package forum.department.repository;

import forum.department.domain.Mentee;
import forum.department.domain.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Long> {



}
