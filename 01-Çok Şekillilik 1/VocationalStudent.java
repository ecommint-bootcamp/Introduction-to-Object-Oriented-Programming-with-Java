import java.util.Date;

public class VocationalStudent extends Student{

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational studied.");
    }

    @Override
    public void register() {
        System.out.println("Vocational registered.");
    }

    @Override
    public String toString() {
        return "VocationalStudent{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
