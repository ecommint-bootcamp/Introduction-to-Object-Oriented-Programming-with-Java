package main.java.com.ozlem.homework.contract;


import main.java.com.ozlem.homework.datamodel.Student;

import java.util.List;

public interface StudentDAOI {


        void saveStudent(Student student);

        Student retrieveStudent(int id);

        List<Student> retrieveAllStudents();

        void updateStudentDOB(Student student);

        void deleteStudent(Student student);

        void deleteAllStudents();



}
