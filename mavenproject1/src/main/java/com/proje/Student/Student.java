/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proje.Student;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author unreal
 */
@Entity(name = "Students")
public class Student implements Serializable {
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	
	@Column(name = "First_Name")
	private String firstName;

	
	@Column(name = "Last_Name")
	private String lastName;

	
	@Column(name = "Year")
	private int year;

	
	@Temporal(TemporalType.DATE)
	@Column(name = "Date_Of_Birt")
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "Gpa")
	private double gpa;

	public Student() {

	}
        
	public Student(String firstName, String lastName, int year, Date dob, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.dob = dob;
		this.gpa = gpa;
	}
        
        
        public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
        public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
        public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
        public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
        
}
