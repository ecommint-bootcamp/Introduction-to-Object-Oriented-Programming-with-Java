package main.java.com.ozlem.homework.test;

import main.java.com.ozlem.homework.datamodel.Student;
import main.java.com.ozlem.homework.dataservice.StudentJpaDAO;

import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentJpaDAO dao = new StudentJpaDAO();

        Student student = new Student(1111, "0zlem", "Karabulut", new Date());
        dao.saveStudent(student);

       	int id = 1401;
		Student studentRetrieved = dao.retrieveStudent(id);
		if (studentRetrieved == null)
			System.out.println("Student does not exists!");
		else
			System.out.println(studentRetrieved);

        List<Student> students = dao.retrieveAllStudents();
        for(Student s : students)
            System.out.println(s);

         dao.deleteStudent(student);

    Student Student = dao.retrieveStudent(366806415);
    System.out.println(Student);
    System.out.println("Before update: " + Student);
    Student.setDob(new Date(100000000));
    dao.updateStudentDOB(Student);
    dao.deleteStudent(Student);
    dao.deleteAllStudents();
    }
}
