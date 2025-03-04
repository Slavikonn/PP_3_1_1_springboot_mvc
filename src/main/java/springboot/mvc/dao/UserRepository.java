package springboot.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
