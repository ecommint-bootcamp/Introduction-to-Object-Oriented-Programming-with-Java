package egecoskun.student;

import java.util.Date;

public abstract class Student {
    private int no;
    private String name;
    private int year;
    private Date  dateOfBirth;
    private String major;

    public Student(int no, String name, int year, Date dateOfBirth, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public abstract void study();
    public abstract void register();

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dateOfBirth=" + dateOfBirth +
                ", major='" + major + '\'' +
                '}';
    }
}
