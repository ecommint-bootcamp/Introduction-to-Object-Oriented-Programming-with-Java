package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dateOfBirth, String major) {
		super(no, name, year, dateOfBirth, major);
	}
	
	public void study() {
		System.out.println("VocationalStudent::study() is worked");
	}
	
	public void register() {
		System.out.println("VocationalStudent::register() is worked");
	}
	
	@Override
	public String toString() {
		return "VocationalStudent[no: " + no + ", name: " + name + ", year: " + year + ", dateOfBirth: " + dateOfBirth + ", major: " + major + "]";
	}
}
