package ly.algjamia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ly.algjamia.model.Teacher;
import ly.algjamia.repository.TeacherRepository;

@Service
@Transactional
public class TeacherServiceImp implements TeacherService {

	@Autowired
	TeacherRepository teacherRepository;
	
	
	@Override
	public List<Teacher> getAllTeachers() {
		return (List<Teacher>) teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacherById(int id) {
		return teacherRepository.findById(id).get();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacher(int id) {
		teacherRepository.deleteById(id);
	}
}