package hw4.controller;

import org.springframework.stereotype.Controller;

import hw4.contract.StudentDao;

@Controller
public class StudentController {
	StudentDao dao;
	
	public StudentController(StudentDao dao) {
		this.dao = dao;
	}
}
