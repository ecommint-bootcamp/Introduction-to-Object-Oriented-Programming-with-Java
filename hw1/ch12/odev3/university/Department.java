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
public class Department {
    private  String name;
    private  Professor head;
    private Course[] courses;
    private  Student[] students;

    public Department(String name, Professor head, Course[] courses, Student[] students) {
        this.name = name;
        this.head = head;
        this.courses = courses;
        this.students = students;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getHead() {
        return head;
    }

    public void setHead(Professor head) {
        this.head = head;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department [name=" + name + ", head=" + head + ", courses=" + Arrays.toString(courses) + ", students="
                + Arrays.toString(students) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(courses);
        result = prime * result + Arrays.hashCode(students);
        result = prime * result + Objects.hash(head, name);
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
        Department other = (Department) obj;
        return Arrays.equals(courses, other.courses) && Objects.equals(head, other.head)
                && Objects.equals(name, other.name) && Arrays.equals(students, other.students);
    }
}
