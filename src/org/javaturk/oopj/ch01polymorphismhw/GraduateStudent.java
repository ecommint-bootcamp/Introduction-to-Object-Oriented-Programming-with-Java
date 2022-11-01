package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class GraduateStudent extends Student {
	
	protected String advisor;
	protected String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dateOfBirth, String major, String advisor, String thesis) {
		super(no, name, year, dateOfBirth, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}
	
	public void study() {
		System.out.println("GraduateStudent::study() is worked");
	}
	
	public void register() {
		System.out.println("GraduateStudent::register() is worked");
	}
	
	public void writeThesis() {
		System.out.println("GraduateStudent::writeThesis() is worked");
	}
	
	public void meetWithAdvisor() {
		System.out.println("GraduateStudent::meetWithAdvisor() is worked");
	}
}
