package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dateOfBirth, String major, String advisor, String thesis) {
		super(no, name, year, dateOfBirth, major, advisor, thesis);
	}

	public void study() {
		System.out.println("MasterStudent::study() is worked");
	}
	
	public void register() {
		System.out.println("MasterStudent::register() is worked");
	}
	
	public void writeThesis() {
		System.out.println("MasterStudent::writeThesis() is worked");
	}
	
	public void meetWithAdvisor() {
		System.out.println("MasterStudent::meetWithAdvisor() is worked");
	}
}
