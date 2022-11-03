package polymorphism;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamTaken;

    public boolean getQualifyingExamTaken() {
        return qualifyingExamTaken;
    }

    public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
            boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("I am a phd student");
    }

    @Override
    public void register() {
        System.out.println("I register on phd school");
    }

    @Override
    public void writeThesis() {
        System.out.println("i am writing thesis for phd degree");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("I am a phd student. I Meeting with advisor");

    }

    public void writePaper() {
        System.out.println("I am writing paper for phd degree");
    }

}
