package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public String toString() {
        return "MasterStudent{" +
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
