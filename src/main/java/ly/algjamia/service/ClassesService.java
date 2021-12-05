package ly.algjamia.service;

import java.util.List;

import ly.algjamia.model.Classes;
import ly.algjamia.model.Student;
import ly.algjamia.model.Subject;
import ly.algjamia.model.Teacher;

public interface ClassesService {

	public List<Classes> getAllClasses();
	
	

	public List<Teacher> getAllTeachers();

	public List<Subject> getAllSubjects();

	public List<Student> getAllStudents();
	
	public Classes getClassesById(int id);

	public void addClasses(Classes classes);

	public void deleteClasses(int id);

}
