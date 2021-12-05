package ly.algjamia.service;

import java.util.List;

import ly.algjamia.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(int id);
	
	public void addStudent(Student student);
	
	public void deleteStudent(int id);

}
