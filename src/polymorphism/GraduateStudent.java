package polymorphism;

import java.util.Date;

public class GraduateStudent extends Student {
    String advisor;
    String thesis;

    public GraduateStudent(int no, String name, int year, Date date, String major, String advisor,
            String thesis) {
        super(no, name, year, date, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("I am a graduate student");
        writeThesis();
    }

    @Override
    public void register() {
        System.out.println("I am register on graduate school");
    }

    public void writeThesis() {
        System.out.println("i am writing thesis for graduate degree");
    }

    public void meetWithAdvisor() {
        System.out.println("I am a graduate student. I Meeting with advisor");
    }

}
