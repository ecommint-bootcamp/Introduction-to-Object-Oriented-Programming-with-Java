package hw1.coksekillilik;

import java.util.Date;

public class UndergraduateStudent extends Student {

    protected String minor;

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }


    @Override
    public void study() {
        System.out.println("Undergraduate Student studying on " + getMinor());
    }

    @Override
    public void register() {
        System.out.println("Undergraduate Student Infos " + getNo() + " " + getName() + " " + getDob());
    }


    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "minor='" + minor + '\'' +
                '}';
    }
}
