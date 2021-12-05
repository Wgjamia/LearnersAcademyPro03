package ly.algjamia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ly.algjamia.model.Classes;
import ly.algjamia.model.Student;
import ly.algjamia.model.Subject;
import ly.algjamia.model.Teacher;
import ly.algjamia.repository.ClassRepository;
import ly.algjamia.repository.StudentRepository;
import ly.algjamia.repository.SubjectRepository;
import ly.algjamia.repository.TeacherRepository;

@Service
@Transactional
public class ClassesServiceImp implements ClassesService {

	@Autowired
	ClassRepository classRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Classes> getAllClasses() {
		return (List<Classes>) classRepository.findAll();
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return (List<Teacher>) teacherRepository.findAll();
	}
	
	
	
	@Override
	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepository.findAll();
	}
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Classes getClassesById(int id) {
		return classRepository.findById(id).get();
	}

	@Override
	public void addClasses(Classes classes) {
		classRepository.save(classes);
	}

	@Override
	public void deleteClasses(int id) {
		classRepository.deleteById(id);
	}
}