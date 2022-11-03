package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major,String thesis,String advisor) {
		super(no, name, year, dob, major,thesis,advisor);
	}
	
	@Override
	public void study() {
		System.out.println("Master Öğrencisi Çalışıyor");
		
		
	}
	@Override
	public void register() {
		System.out.println("Master Öğrencisi kayıt edildi");
	}
	
	@Override
	public void writeThesis() {
		
		System.out.println("Master Öğrencisinin tesisi "+thesis);
	}
	@Override
	public void meetWithAdvisor() {
		
		
		System.out.println("Master Öğrencisi Danışmanınyla görüşüyor "+thesis);
	}

}
