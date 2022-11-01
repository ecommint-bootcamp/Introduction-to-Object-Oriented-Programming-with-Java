package org.javaturk.oopj.ch01polymorphismhw;

import java.util.ArrayList;
import java.util.List;

public class RegistrationOffice {
	
	private List<Student> students;
	
	public RegistrationOffice() {
		students = new ArrayList<>();
	}
	
	public Student getAStudent() {
		int i = (int) (5 * Math.random());
		
		Student student = students.get(i);
		
		if (student instanceof UndergraduateStudent) {
			UndergraduateStudent s = (UndergraduateStudent) student;
			s.study();
			return s;
		} else if (student instanceof VocationalStudent) {
			VocationalStudent s = (VocationalStudent) student;
			s.study();
			return s;
		} else if (student instanceof MasterStudent) {
			MasterStudent s = (MasterStudent) student;
			s.study();
			return s;
		} else if (student instanceof PhdStudent) {
			PhdStudent s = (PhdStudent) student;
			s.study();
			return s;
		} else if (student instanceof GraduateStudent) {
			GraduateStudent s = (GraduateStudent) student;
			s.study();
			return s;
		}
		
		student.study();
		return student;
	}
	
	public void registerStudent(Student student) {
		students.add(student);
	}
}
