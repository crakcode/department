package forum.department.repository;

import forum.department.domain.Category;
import forum.department.domain.Mentee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenteeRepository extends JpaRepository<Mentee,Long> {



}
