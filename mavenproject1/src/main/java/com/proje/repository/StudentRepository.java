/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proje.repository;

import com.proje.Student.Student;


/**
 *
 * @author unreal
 */
public interface StudentRepository {
        public void saveStudent(Student student);

	public Student find(int id);

	public Student updateStudent(Student student);

	public void deleteStudent(int id);
}
