package pl.coderslab.crm_workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_workshop.Entity.TaskStatus;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {

}
