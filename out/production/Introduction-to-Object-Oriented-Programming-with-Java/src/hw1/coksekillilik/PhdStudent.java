package hw1.coksekillilik;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

    protected boolean qualifyingExamTaken;

    public boolean isQualifyingExamTaken() {
        return qualifyingExamTaken;
    }

    public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken=qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("Buyuk sehirin PHD Studenti : " + getName()+ " calisiyor");
    }

    @Override
    public void register() {
        System.out.println("Phd Student Infos : " + getName()+ "\n" + getMajor());
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd Student is writing about : " + getThesis());
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd Student's Advisor Infos : " + getAdvisor());
    }

    public void writePaper(){
        System.out.println("Kral yaziyor masallah ya :))");
    }





}
