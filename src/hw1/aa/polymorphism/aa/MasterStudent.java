package hw1.aa.polymorphism.aa;

import hw1.aa.polymorphism.interfaces.GraduateStudent;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    public void meetWithAdvisor() {};

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    @Override
    public void writeThesis() {
        super.writeThesis();
    }
}
