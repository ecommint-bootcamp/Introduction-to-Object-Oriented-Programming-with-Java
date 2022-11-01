package hw1.ch12.odev3.university;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Student {
    private String no;
    private String name;
    private String dob;
    private Department department;
    private Professor advisor;
    private Course[] coursesTaken;

    public Student() {
    }

    public Student(String no, String name, String dob, Department department, Professor advisor,
                   Course[] coursesTaken) {
        this.no = no;
        this.name = name;
        this.dob = dob;
        this.department = department;
        this.advisor = advisor;
        this.coursesTaken = coursesTaken;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + ", dob=" + dob + ", department=" + department + ", advisor="
                + advisor + ", coursesTaken=" + Arrays.toString(coursesTaken) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(coursesTaken);
        result = prime * result + Objects.hash(advisor, department, dob, name, no);
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
        Student other = (Student) obj;
        return Objects.equals(advisor, other.advisor) && Arrays.equals(coursesTaken, other.coursesTaken)
                && Objects.equals(department, other.department) && Objects.equals(dob, other.dob)
                && Objects.equals(name, other.name) && Objects.equals(no, other.no);
    }
}
