package hw4.contract;

import java.util.List;

import hw4.domain.Student;

public interface StudentDao {
	public void saveStudent(Student student);

	public Student getStudentById(int id);

	public List<Student> listAllStudent();

	public void updateStudent(Student student);

	public void deleteStudent(int id);
}
