package polymorphism;

import java.sql.Date;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("I am a master student");
        writeThesis();
    }

    @Override
    public void register() {
        System.out.println("I am register on master degree");
    }

    @Override
    public void writeThesis() {
        System.out.println("i am writing thesis for master degree");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("I am a master student. I Meeting with advisor");
    }

}
