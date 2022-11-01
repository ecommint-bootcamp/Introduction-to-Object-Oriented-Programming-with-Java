import java.util.Date;

public class GraduateStudent extends Student{
    public String advisor;
    public String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate studied.");
    }

    @Override
    public void register() {
        System.out.println("Graduate registered.");
    }

    public void writeThesis(){
        System.out.println("Graduate writed thesis.");
    }

    public void meetWithAdvisor(){
        System.out.println("Graduate meeted with advisor.");
    }
}
