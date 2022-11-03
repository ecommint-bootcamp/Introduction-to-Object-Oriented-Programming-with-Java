package hw1.aa.polymorphism.aa;

import java.util.Date;

public class VacotionalStudent extends Student {

    public VacotionalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
