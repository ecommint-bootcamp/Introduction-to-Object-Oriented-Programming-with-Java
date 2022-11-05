package hw1.coksekillilik;

import java.util.Date;

public class VocationalStudent extends Student{

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println( "Arbeitet er/sie über " + getMajor());
    }

    @Override
    public void register() {
        System.out.println("Vocational Student registered with dies Infos : " + getNo() + " "+ getName()+ " "+ getDob());
    }

    @Override
    public String toString() {
        return "VocationalStudent [toString()=" + super.toString() + "]";
    }
}
