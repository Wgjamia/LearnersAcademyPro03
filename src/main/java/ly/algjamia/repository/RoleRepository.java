package ly.algjamia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ly.algjamia.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}