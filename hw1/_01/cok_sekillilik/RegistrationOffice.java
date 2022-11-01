package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistrationOffice {

    private final List<Student> studentList= new ArrayList<>();;

    public RegistrationOffice() {

    }

    public void registerStudent(Student student){
        studentList.add(student);
    }

    public Student getAStudent(){
        Random random = new Random();
        return studentList.get(random.nextInt(studentList.size()));
    }



}
