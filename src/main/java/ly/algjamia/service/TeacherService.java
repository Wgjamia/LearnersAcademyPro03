package ly.algjamia.service;

import java.util.List;

import ly.algjamia.model.Teacher;

public interface TeacherService {
	
	public List<Teacher> getAllTeachers();
	
	public Teacher getTeacherById(int id);
	
	public void addTeacher(Teacher teacher);
	
	public void deleteTeacher(int id);

}
