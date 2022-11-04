import java.util.Date;

public class Student {
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;

    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public void study(){
        System.out.println("Student Studied.");
    }

    public void register(){
        System.out.println("Student Registered.");
    }

    @Override
    public String toString() {
        return "Student { " + "No = " + no + ", Name = " + name + '\'' + ", Year = " + year + ", Date of Birth = " + dob + ", Major = " + major + '\'' + '}';
    }
}
