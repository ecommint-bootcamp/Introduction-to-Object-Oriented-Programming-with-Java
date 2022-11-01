package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class UndergraduateStudent extends Student{

    protected String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }
}
