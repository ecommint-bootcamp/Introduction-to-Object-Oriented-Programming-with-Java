package hw1.ch12.odev3.university;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Professor {
    private String no;
    private String name;
    private String dob;
    private String rank;
    private Department department;
    private Student[] advisee;
    private Course[] coursesGiven;

    public Professor() {
    }

    public Professor(String no, String name, String dob, String rank, Department department, Student[] advisee, Course[] coursesGiven) {
        this.no = no;
        this.name = name;
        this.dob = dob;
        this.rank = rank;
        this.department = department;
        this.advisee = advisee;
        this.coursesGiven = coursesGiven;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student[] getAdvisee() {
        return advisee;
    }

    public void setAdvisee(Student[] advisee) {
        this.advisee = advisee;
    }

    public Course[] getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(Course[] coursesGiven) {
        this.coursesGiven = coursesGiven;
    }

    @Override
    public String toString() {
        return "Professor [no=" + no + ", name=" + name + ", dob=" + dob + ", rank=" + rank + ", department="
                + department + ", advisee=" + Arrays.toString(advisee) + ", coursesGiven="
                + Arrays.toString(coursesGiven) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(advisee);
        result = prime * result + Arrays.hashCode(coursesGiven);
        result = prime * result + Objects.hash(department, dob, name, no, rank);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Professor other = (Professor) obj;
        return Arrays.equals(advisee, other.advisee) && Arrays.equals(coursesGiven, other.coursesGiven)
                && Objects.equals(department, other.department) && Objects.equals(dob, other.dob)
                && Objects.equals(name, other.name) && Objects.equals(no, other.no) && Objects.equals(rank, other.rank);
    }
}
