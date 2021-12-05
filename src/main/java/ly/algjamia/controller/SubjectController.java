package ly.algjamia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ly.algjamia.model.Subject;
import ly.algjamia.service.SubjectService;

@Controller
@RequestMapping(value="/subject")
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("subject_list");
	  List<Subject> subjectList = subjectService.getAllSubjects();
	  model.addObject("subjectList", subjectList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addSubject/", method=RequestMethod.GET)
	 public ModelAndView addSuject() {
		 
	  ModelAndView model = new ModelAndView();
	  Subject subject = new Subject();
	  model.addObject("subjectForm", subject);
	  model.setViewName("subject_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editSubject/{id}", method=RequestMethod.GET)
	 public ModelAndView editSubject(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Subject subject = subjectService.getSubjectById(id);
	  model.addObject("subjectForm", subject);
	  model.setViewName("subject_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addSubject", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("subjetcForm") Subject subject) {
		 
	  subjectService.addSubject(subject);
	  return new ModelAndView("redirect:/subject/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteSubject/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  subjectService.deleteSubject(id);
	  return new ModelAndView("redirect:/subject/list");
	  
	 }

}
