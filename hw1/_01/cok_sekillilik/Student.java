package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class Student {

    protected int no;
    protected String name;
    protected int year;
    protected Date dob;
    protected String major;

    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    private void study(){

    }

    private void register(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
