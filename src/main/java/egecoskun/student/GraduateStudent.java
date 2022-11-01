package egecoskun.student;

import java.util.Date;

public class GraduateStudent extends Student{
    private String advisor;
    private String thesis;

    public GraduateStudent(int no, String name, int year, Date dateOfBirth, String major,String advisor,String thesis) {
        super(no, name, year, dateOfBirth, major);
        this.advisor=advisor;
        this.thesis=thesis;
    }


    public String getAdvisor() {
        return advisor;
    }

    public String getThesis() {
        return thesis;
    }

    @Override
    public void study() {

    }

    @Override
    public void register() {

    }

    public void writeThesis(){

    }

    public void meetWithAdvisor(){

    }
}
