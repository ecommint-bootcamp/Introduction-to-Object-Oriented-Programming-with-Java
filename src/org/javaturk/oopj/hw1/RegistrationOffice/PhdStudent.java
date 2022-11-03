package org.javaturk.oopj.hw1.RegistrationOffice;

import java.util.Date;

public class PhdStudent extends MasterStudent {

	public PhdStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor) {
		super(no, name, year, dob, major, thesis, advisor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("Doktora Öğrencisi Çalışıyor");
	}
	@Override
	public void register() {
		System.out.println("Doktora Öğrencisi kayıt edildi");
	}
	
	@Override
	public void writeThesis() {
		
		System.out.println("Doktora Öğrencisinin tesisi "+thesis);
	}
	@Override
	public void meetWithAdvisor() {
		
		
		System.out.println("Doktora Danışmanınla Görüş "+thesis);
	}
	
	public void writePaper() {
		System.out.println("Doktora Öğrencisinin Kağıdı");
		
		
	}
	
	
	

}
