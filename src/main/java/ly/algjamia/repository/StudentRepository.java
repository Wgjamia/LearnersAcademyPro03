package ly.algjamia.repository;

import org.springframework.data.repository.CrudRepository;

import ly.algjamia.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
