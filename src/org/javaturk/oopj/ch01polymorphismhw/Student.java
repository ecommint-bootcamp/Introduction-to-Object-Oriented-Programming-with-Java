package org.javaturk.oopj.ch01polymorphismhw;

import java.util.Date;

public class Student {
	
	protected int no;
	protected String name;
	protected int year;
	protected Date dateOfBirth;
	protected String major;
	
	public Student(int no, String name, int year, Date dateOfBirth, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dateOfBirth = dateOfBirth;
		this.major = major;
	}
	
	public void study() {
		System.out.println("Student::study() is worked");
	}
	
	public void register() {
		System.out.println("Student::register() is worked");
	}
	
	@Override
	public String toString() {
		return "Student[no: " + no + ", name: " + name + ", year: " + year + ", dateOfBirth: " + dateOfBirth + ", major: " + major + "]";
	}
}
