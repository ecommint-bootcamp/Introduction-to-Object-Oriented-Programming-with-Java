package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class RegistrationOfficeTest {

	public static void main(String[] args) {
		
		//Student s1 = new Student(12,"ali",1999,new Date(),"ahmet");
		PhdStudent s2= new PhdStudent(455, "burak", 1999, new Date(), "Biology", "thesis 1","Prof x");
		UnderGraduateStudent s3= new UnderGraduateStudent(121, "oguzhan", 1999, new Date(), "physics ", "chemistry");
		VocationalStudent s4 = new VocationalStudent(675, "ali", 1997, new Date(), "machine");
		MasterStudent s5 = new MasterStudent(45, "buse", 2000, new Date(), "Comouter Science", "thesis 3", "Prof c");
		GraduateStudent s6 = new GraduateStudent(1252, "kerem", 1998, new Date(), "Law", " thesis 4", "Prof d");
		
		
		RegistrationOffice a= new RegistrationOffice();
		a.registerStudent(s2);
		a.registerStudent(s3);
		a.registerStudent(s4);
		a.registerStudent(s5);
		a.registerStudent(s6);
		
		
		System.out.println();
		
		a.getAStudent();
		
		
		
		
		
		
		
		
		
		

	}

}
