package org.javaturk.oopj.hw1.university;

import java.util.Date;

abstract public class GraduateStudent extends Student {
    protected String advisor;
    protected String thesis;


    GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    abstract public void writeThesis();

    abstract public void meetWithAdvisor();


}
