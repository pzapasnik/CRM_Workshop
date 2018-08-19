package pl.coderslab.crm_workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_workshop.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
