package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistrationOffice {
	
	private   List<Student> students = new ArrayList<Student> ();

	public RegistrationOffice() {}

	public List<Student> getStudents() {
		return students;
	}
	
	
	public Student getAStudent() {
		
		 Random rand = new Random();
		 int i= rand.nextInt(5);
		
		 if(students.get(i) instanceof PhdStudent) {
			 PhdStudent s = (PhdStudent)students.get(i); 
			 s.study();
			 s.writePaper();
			 toString();
			 return s;
		 }
		 else if(students.get(i) instanceof MasterStudent) {
			 MasterStudent s = (MasterStudent)students.get(i); 
			 s.study();
			 s.meetWithAdvisor();
			 s.writeThesis();
			 toString();
			 return s;
		 }else if(students.get(i) instanceof GraduateStudent) {
			 GraduateStudent s = (GraduateStudent)students.get(i); 
			 s.study();
			 s.meetWithAdvisor();
			 s.writeThesis();
			 toString();
			 return s;
		 }else if(students.get(i) instanceof VocationalStudent) {
			 VocationalStudent s = (VocationalStudent)students.get(i); 
			 s.study();
			 toString();
			 return s;
		 }else if(students.get(i) instanceof UnderGraduateStudent) {
			 UnderGraduateStudent s = (UnderGraduateStudent)students.get(i); 
			 s.study();
			 s.toString();
			 return s;
		 }
		 
		 else {
			 return students.get(i);
		 }
		
		
		
	}
	
	public void registerStudent(Student student) {
		student.register();
		students.add(student);
	}
	



	
	
	
	
	

}
