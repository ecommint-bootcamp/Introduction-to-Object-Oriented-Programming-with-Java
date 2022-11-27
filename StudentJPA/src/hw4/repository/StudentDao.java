package hw4.repository;

import java.util.List;

import hw4.domain.Student;


public interface StudentDao {
	
	public void saveStudent(Student student);
	
	public Student retrieveStudent(int id);
	
	public List<Student> retrieveAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);
	
	public void deleteAllStudents();
}
