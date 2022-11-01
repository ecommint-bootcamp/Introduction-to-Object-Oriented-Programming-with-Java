import java.util.Date;

public class PhdStudent extends GraduateStudent{
    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("PhdStudent studied.");
    }

    @Override
    public void register() {
        System.out.println("PhdStudent registered.");
    }

    @Override
    public void writeThesis() {
        System.out.println("PhdStudent writed thesis.");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("PhdStudent meeted with advisor.");
    }

    public void writePaper(){
        System.out.println("PhdStudent writed paper.");
    }
}
