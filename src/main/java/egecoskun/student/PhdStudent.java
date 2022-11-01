package egecoskun.student;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
    private boolean qualifyingExamTaken;

    public boolean isQualifyingExamTaken() {
        return qualifyingExamTaken;
    }

    public PhdStudent(int no, String name, int year, Date dateOfBirth, String major, String advisor, String thesis,Boolean qualifyingExamTaken) {
        super(no, name, year, dateOfBirth, major, advisor, thesis);
        this.qualifyingExamTaken=qualifyingExamTaken;
    }
    @Override
    public void study(){
    }
    @Override
    public void register() {
    }

    @Override
    public void writeThesis(){
    }

    @Override
    public void meetWithAdvisor(){
    }
    public void writePaper(){

    }
}
