package hw1.aa.polymorphism.aa;

import hw1.aa.polymorphism.interfaces.GraduateStudent;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

    private boolean qualilfyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualilfyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualilfyingExamTaken = qualilfyingExamTaken;
    }


    public void writePaper() {};

    @Override
    public void writeThesis() {
        super.writeThesis();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }
}
