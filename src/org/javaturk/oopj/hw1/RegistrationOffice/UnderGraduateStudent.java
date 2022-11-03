package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class UnderGraduateStudent extends Student {
	private String minor;

	public UnderGraduateStudent(int no, String name, int year, Date dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor=minor;
	}
	
	
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	@Override
	public void study() {
		System.out.println("Lisans Öğrencisi Çalışıyor");
		
	}
	@Override
	public void register() {
		System.out.println("Lisans Öğrencisi kayıt edildi");
	}
	
	
	public String toString() {
		
		String s = new String();
				
				s += "Lisans Öğrencisi Bilgileri \n";
				s += "no : " + no + "\n";
				s += "name : " + name + "\n";
				s += "year : " + year + "\n";
				s += "dob : " + dob + "\n";
				s += "major : " + major + "\n";
				
				return s;
			}



	
	

}
