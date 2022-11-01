package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class GraduateStudent extends Student{

    protected String advisor;
    protected String thesis;


    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    private void writeThesis(){

    }

    private void meetWithAdvisor(){

    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "advisor='" + advisor + '\'' +
                ", thesis='" + thesis + '\'' +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
