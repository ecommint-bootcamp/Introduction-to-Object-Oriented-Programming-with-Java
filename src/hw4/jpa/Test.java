package hw4.jpa;

import java.util.Date;
import java.util.List;

import hw4.contract.StudentDao;
import hw4.domain.Student;

public class Test {

	public static void main(String[] args) {

		Student student = new Student("Bekir", "Göl", 25, new Date(), 3.4);

		StudentDao studentDao = new StudentJpaDao();

		// Save Student
//		studentDao.saveStudent(student);
		
		// Retrieve All Student
//		List<Student> students = studentDao.listAllStudent();
//		for (Student items : students) {
//			System.out.println(items.getFirstName());
//		}
		
		// Retrieve Student By Id
//		Student student1 = studentDao.getStudentById(1);
//		System.out.println(student1.getFirstName());
		
		// Update Student
//		Student student2 = new Student("Ahmet", "Göl", 23, new Date(), 2.5);
//		studentDao.updateStudent(student2);
		
		// Delete Student
//		studentDao.deleteStudent(51);
	}
}
