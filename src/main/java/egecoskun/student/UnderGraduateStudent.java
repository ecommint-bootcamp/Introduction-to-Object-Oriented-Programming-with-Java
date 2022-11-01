package egecoskun.student;

import java.util.Date;

public class UnderGraduateStudent extends Student{
    private String minor;

    public UnderGraduateStudent(int no, String name, int year, Date dateOfBirth, String major,String minor) {
        super(no, name, year, dateOfBirth, major);
        this.minor=minor;
    }

    @Override
    public void study() {

    }

    @Override
    public void register() {

    }

    @Override
    public String toString() {
        return "UnderGraduateStudent{" +
                "minor='" + minor + '\'' +
                "} " + super.toString();
    }
}
