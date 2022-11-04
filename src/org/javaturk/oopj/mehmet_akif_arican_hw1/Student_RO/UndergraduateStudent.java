import java.util.Date;

public class UndergraduateStudent extends Student{
    public String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("Undergraduate studied");
    }

    @Override
    public void register() {
        System.out.println("Undergraduate registered.");
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" + "Minor = '" + minor + '\'' + ", No = " + no +", Name = " + name + '\'' + ", Year = " + year + ", Date of Birth = " + dob + ", Major = '" + major + '\'' +'}';
    }
}
