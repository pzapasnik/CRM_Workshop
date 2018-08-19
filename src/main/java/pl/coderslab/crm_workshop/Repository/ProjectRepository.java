package pl.coderslab.crm_workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_workshop.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
