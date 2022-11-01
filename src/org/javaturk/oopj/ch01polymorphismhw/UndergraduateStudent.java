package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class UndergraduateStudent extends Student {
	
	private String minor;
	
	public UndergraduateStudent(int no, String name, int year, Date dateOfBirth, String major, String minor) {
		super(no, name, year, dateOfBirth, major);
		this.minor = minor;
	}
	
	public void study() {
		System.out.println("UndergraduateStudent::study() is worked");
	}
	
	public void register() {
		System.out.println("UndergraduateStudent::register() is worked");
	}
	
	@Override
	public String toString() {
		return "UndergraduateStudent[no: " + no + ", name: " + name + ", year: " + year + ", dateOfBirth: " + dateOfBirth + ", major: " + major + ", minor: " + minor + "]";
	}
}
