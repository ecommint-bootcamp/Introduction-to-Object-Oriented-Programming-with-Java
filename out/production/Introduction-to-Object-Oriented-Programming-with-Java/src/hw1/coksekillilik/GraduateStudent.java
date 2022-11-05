package hw1.coksekillilik;

import java.util.Date;

public class GraduateStudent extends Student  {

 protected String advisor;
 protected String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor=advisor;
        this.thesis=thesis;

    }


    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduation Studies : " + getThesis());
    }

    @Override
    public void register() {
        System.out.println("Graduated Student Information: " + "\nNumber: " + getNo() + "\nName: " + getName() + "\nMajor: "+ getMajor() + "\nGraduated Date : " + getDob());
    }

    public void writeThesis(){
        System.out.println("Graduation Thesis is : " + getThesis());
    }

    public void meetWithAdvisor(){
        System.out.println("Graduation Advisor is : " + getAdvisor());
    }



}
