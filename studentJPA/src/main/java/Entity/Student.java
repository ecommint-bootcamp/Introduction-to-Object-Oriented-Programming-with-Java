package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Students")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "Adi")
    private String firstName;

    @Column(name = "SoyAdi")
    private String lastName;

    @Column(name = "YEAR")
    private int year;

    @Temporal(TemporalType.DATE)
    @Column(name = "Dogum_Yili")
    private Date dob;

    @Column(name = "GPA")
    private double GPA;

    public Student() {
    }

    public Student(String firstName, String lastName, int year, Date dob, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.dob = dob;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
