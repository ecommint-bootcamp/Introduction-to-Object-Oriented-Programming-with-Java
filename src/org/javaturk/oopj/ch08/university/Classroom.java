package org.javaturk.oopj.ch08.university;

public class Classroom {

    String code;
    String name;
    int capaticy;
    Course[] courses;

    public String getCode() {
        return code;
    }
    public void setCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapaticy() {
        return capaticy;
    }

    public void setCapaticy(int capaticy) {
        this.capaticy = capaticy;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
