package org.javaturk.oopj.ch08.university;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
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
