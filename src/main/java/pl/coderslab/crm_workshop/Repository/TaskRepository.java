package pl.coderslab.crm_workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_workshop.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
