package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public abstract class Student {
	
	protected int no;
	
	protected String name;

	protected int year;
	
	protected Date dob;
	
	protected String major;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(int no, String name, int year, Date dob, String major) {
		
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	
	
	public void study() {
		System.out.println("Öğrenci Çalışıyor");
		
		
	}
	
	public void register() {
		System.out.println("Öğrenci kayıt edildi");
	}
	
	@Override
	public String toString() {
		
		String s = new String();
		
		s += "Student Bilgileri \n";
		s += "no : " + no + "\n";
		s += "name : " + name + "\n";
		s += "year : " + year + "\n";
		s += "dob : " + dob + "\n";
		s += "major : " + major + "\n";
		
		return s;
	}
	
	
	
	
	

}
