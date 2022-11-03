package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class GraduateStudent extends Student {
	protected String thesis;
	protected String advisor;
	
	
	
	public GraduateStudent(int no, String name, int year, Date dob, String major,String thesis,String advisor) {
		super(no, name, year, dob, major);
		
		this.thesis=thesis;
		this.advisor=advisor;
		
		
	}

	
	
	@Override
	public void study() {
		System.out.println("Yüksek Lisans Öğrencisi Çalışıyor");
		
	}
	@Override
	public void register() {
		System.out.println("Yüksek Lisans Öğrencisi kayıt edildi");
	}
	
	
	public void writeThesis() {
		
		System.out.println("Yüksek Lisans Öğrencisinin tesisi "+thesis);
	}
	
	public void meetWithAdvisor() {
		
		System.out.println("Yüksek Lisans Öğrencisinin danışmanı "+advisor);
		
	}

}
