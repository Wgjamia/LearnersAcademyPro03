package ly.algjamia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ly.algjamia.model.Subject;
import ly.algjamia.repository.SubjectRepository;

@Service
@Transactional
public class SubjectServiceImp implements SubjectService {

	@Autowired
	SubjectRepository subjectRepository;
	
	
	@Override
	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepository.findAll();
	}

	@Override
	public Subject getSubjectById(int id) {
		return subjectRepository.findById(id).get();
	}

	@Override
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	@Override
	public void deleteSubject(int id) {
		subjectRepository.deleteById(id);
	}
}