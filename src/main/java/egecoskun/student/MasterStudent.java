package egecoskun.student;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
    public MasterStudent(int no, String name, int year, Date dateOfBirth, String major, String advisor, String thesis) {
        super(no, name, year, dateOfBirth, major, advisor, thesis);
    }

    @Override
    public void study(){
    }
    @Override
    public void register() {
    }

    @Override
    public void writeThesis(){
    }

    @Override
    public void meetWithAdvisor(){
    }
}
