package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class VocationalStudent extends Student{
    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public String toString() {
        return "VocationalStudent{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
