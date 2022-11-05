package hw1.coksekillilik;

import java.util.Date;

public class MasterStudent  extends GraduateStudent{


    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master Student " + getName() + " is studiert on " + getThesis());
    }

    @Override
    public void register() {
        System.out.println("Master Student Information's : " + "\nNumber: " + getNo() + "\nName: " + getName() + "\nMajor: "+ getMajor());
    }

    @Override
    public void writeThesis() {
        System.out.println("Name of Master Thesis : " + getThesis());
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Name of Master Advisor is " + getAdvisor());
    }

}
