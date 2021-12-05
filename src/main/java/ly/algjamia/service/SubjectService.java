package ly.algjamia.service;

import java.util.List;

import ly.algjamia.model.Subject;

public interface SubjectService {

	public List<Subject> getAllSubjects();

	public Subject getSubjectById(int id);

	public void addSubject(Subject subject);

	public void deleteSubject(int id);

}
