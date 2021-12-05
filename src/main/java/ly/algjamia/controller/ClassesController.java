package ly.algjamia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ly.algjamia.model.Classes;
import ly.algjamia.model.Student;
import ly.algjamia.model.Subject;
import ly.algjamia.model.Teacher;
import ly.algjamia.service.ClassesService;
import ly.algjamia.service.TeacherService;

@Controller
@RequestMapping(value="/classes")

public class ClassesController {
	
	@Autowired
	ClassesService classesService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	SubjectController subjectController;
	
	@Autowired
	StudentController studentController;
	
	
	
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("classes_list");
	  List<Classes> classesList = classesService.getAllClasses();
	  model.addObject("classesList", classesList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addclasses/", method=RequestMethod.GET)
	 public ModelAndView addClasses() {
		 List<Teacher> teacherList = classesService.getAllTeachers();
		 List<Subject> subjectList = classesService.getAllSubjects();
		 List<Student> studentList = classesService.getAllStudents();
	  ModelAndView model = new ModelAndView();
	  Classes classes = new Classes();
	  model.addObject("classesForm", classes);
	  model.addObject("teacherlist", teacherList);
	  model.addObject("subjectList", subjectList);
	  model.addObject("studentList", studentList);
	  model.setViewName("classes_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/getNameOfTech/{Tracher_id}", method=RequestMethod.GET)
	 public ModelAndView viewClassesTech(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Teacher teacher = teacherService.getTeacherById(id);
	  model.addObject("getTeacherById", teacher);
	  model.setViewName("classes_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/editclasses/{id}", method=RequestMethod.GET)
	 public ModelAndView editClasses(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Classes classes = classesService.getClassesById(id);
	  model.addObject("classesForm", classes);
	  model.setViewName("classes_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addclasses", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("classesForm") Classes classes) {
		 
	  classesService.addClasses(classes);
	  return new ModelAndView("redirect:/classes/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteClasses/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  classesService.deleteClasses(id);
	  return new ModelAndView("redirect:/classes/list");
	  
	 }
}
