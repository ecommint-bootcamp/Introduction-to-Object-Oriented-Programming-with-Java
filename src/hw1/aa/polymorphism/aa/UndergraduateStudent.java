package hw1.aa.polymorphism.aa;

import java.util.Date;

public class UndergraduateStudent extends Student {

    private String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
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
        return "UndergraduateStudent{" +
                "minor='" + minor + '\'' +
                '}';
    }
}
