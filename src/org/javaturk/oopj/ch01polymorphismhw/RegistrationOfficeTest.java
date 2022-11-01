package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class RegistrationOfficeTest {
	
	public static void main(String ... args) {
	
		RegistrationOffice office = new RegistrationOffice();
		
		office.registerStudent(new Student(1, "Student", 1, new Date(), "a"));
		office.registerStudent(new VocationalStudent(1, "VocationalStudent", 1, new Date(), "a"));
		office.registerStudent(new GraduateStudent(1, "GraduateStudent", 1, new Date(), "a", "a", "a"));
		office.registerStudent(new UndergraduateStudent(1, "UndergraduateStudent", 1, new Date(), "a", "a"));
		office.registerStudent(new MasterStudent(1, "MasterStudent", 1, new Date(), "a", "a", "a"));
		office.registerStudent(new PhdStudent(1, "PhdStudent", 1, new Date(), "a", "a", "a", true));
		office.registerStudent(new VocationalStudent(1, "VocationalStudent", 1, new Date(), "a"));
		office.registerStudent(new GraduateStudent(1, "GraduateStudent", 1, new Date(), "a", "a", "a"));
		office.registerStudent(new UndergraduateStudent(1, "UndergraduateStudent", 1, new Date(), "a", "a"));
		office.registerStudent(new MasterStudent(1, "MasterStudent", 1, new Date(), "a", "a", "a"));
		office.registerStudent(new PhdStudent(1, "PhdStudent", 1, new Date(), "a", "a", "a", true));
		
		Student student = office.getAStudent();
		System.out.println(student.toString());
	}
}
