package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	
	private boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dateOfBirth, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, dateOfBirth, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public void study() {
		System.out.println("PhdStudent::study() is worked");
	}
	
	public void register() {
		System.out.println("PhdStudent::register() is worked");
	}
	
	public void writeThesis() {
		System.out.println("PhdStudent::writeThesis() is worked");
	}
	
	public void meetWithAdvisor() {
		System.out.println("PhdStudent::meetWithAdvisor() is worked");
	}
	
	public void writePaper() {
		System.out.println("PhdStudent::writePaper() is worked");
	}
}
