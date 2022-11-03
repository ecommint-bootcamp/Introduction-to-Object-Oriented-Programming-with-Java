package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}
	

	public void study() {
		System.out.println("Meslek Öğrencisi Çalışıyor");
		
		
	}
	
	public void register() {
		System.out.println("Meslek Öğrencisi kayıt edildi");
	}
	
	public String toString() {
		
String s = new String();
		
		s += "Meslek Öğrencisi Bilgileri \n";
		s += "no : " + no + "\n";
		s += "name : " + name + "\n";
		s += "year : " + year + "\n";
		s += "dob : " + dob + "\n";
		s += "major : " + major + "\n";
		
		return s;
	}
	
	
	
	
	
	
	
	

}
