package hw1.ch12.odev3.university;

import java.util.Arrays;
import java.util.Objects;

public class Classroom {
    private int studentCapacity;
    private Course[] courses;
    private int coursesTaken;
    private String classroomName;

    public Classroom() {
    }


    public Classroom(int studentCapacity, Course[] courses, int coursesTaken, String classroomName) {
        this.studentCapacity = studentCapacity;
        this.courses = courses;
        this.coursesTaken = coursesTaken;
        this.classroomName = classroomName;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public int getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(int coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }


    @Override
    public String toString() {
        return "Classroom [studentCapacity=" + studentCapacity + ", courses=" + Arrays.toString(courses)
                + ", coursesTaken=" + coursesTaken + ", classroomName=" + classroomName + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(courses);
        result = prime * result + Objects.hash(classroomName, coursesTaken, studentCapacity);
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
        Classroom other = (Classroom) obj;
        return Objects.equals(classroomName, other.classroomName) && Arrays.equals(courses, other.courses)
                && coursesTaken == other.coursesTaken && studentCapacity == other.studentCapacity;
    }

}

