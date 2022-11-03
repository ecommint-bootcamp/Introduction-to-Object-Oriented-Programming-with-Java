package polymorphism;

import java.sql.Date;

public class UnderGraduateStudent extends Student {
    String minor;

    public UnderGraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("I am a undergraduate student.");
    }

    @Override
    public void register() {
        System.out.println("I am register on undergraduate school");
    }

    @Override
    public String toString() {
        return "My name is " + super.getName() + " i am a undergraduate student.";
    }

}
