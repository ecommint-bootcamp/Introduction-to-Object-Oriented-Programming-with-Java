import java.util.Date;

public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master studied.");
    }

    @Override
    public void register() {
        System.out.println("Master registered.");
    }

    @Override
    public void writeThesis() {
        System.out.println("Master writed thesis.");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master meeted with advisor.");
    }
}
