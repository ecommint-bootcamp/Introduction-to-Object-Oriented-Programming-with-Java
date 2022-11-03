package hw1.aa.polymorphism.aa;

import java.util.Date;

public class RegistrationOffice {

    public RegistrationOffice() {
    }

    public Student getAStudent() {
        return new Student(10,"cagatay",2018,new Date(),"Akın Kaldıroğlu");
    }

    public void registerStudent(Student student) {

    }
}
