package org.javaturk.oopj.hw1._01.cok_sekillilik;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    public void writePaper(){

    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "advisor='" + advisor + '\'' +
                ", thesis='" + thesis + '\'' +
                ", qualifyingExamTaken=" + qualifyingExamTaken +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
