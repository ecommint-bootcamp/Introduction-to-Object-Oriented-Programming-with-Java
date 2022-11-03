package hw1.aa.polymorphism.interfaces;

import hw1.aa.polymorphism.aa.Student;

import java.util.Date;

public class GraduateStudent extends Student {

    private String advisor;
    private String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    public void writeThesis() {};

    public void meetWithAdvisor() {};

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }
}
