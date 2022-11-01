package egecoskun.student;

import java.util.Date;

public class VocationalStudent extends Student{
    public VocationalStudent(int no, String name, int year, Date dateOfBirth, String major) {
        super(no, name, year, dateOfBirth, major);
    }

    @Override
    public void study() {

    }

    @Override
    public void register() {

    }

    @Override
    public String toString() {
        return "VocationalStudent{} " + super.toString();
    }
}
