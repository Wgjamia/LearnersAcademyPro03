package ly.algjamia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ly.algjamia.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
