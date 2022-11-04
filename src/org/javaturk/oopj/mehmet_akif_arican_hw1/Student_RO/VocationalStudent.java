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
        return "VocationalStudent { " + " No = " + no + ", Name = '" + name + '\'' + ", Year = " + year + ", Date of Birth = " + dob +", Major ='" + major + '\'' + '}';
    }
}
