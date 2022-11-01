package hw1.ch12.odev3.university;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Test {

    public static void main(String[] args) {
        Department department1 = new Department();
        //	department1.name = "Software Engineering";
        department1.setName("Software Engineering");

        Professor professor1 = new Professor();
        //  professor1.name = "Ahmet Arslan";
        professor1.setName("Ahmet Arslan");

        Course course1 = new Course();
        //  course1.name = "Int. to Software Engineering";
        course1.setName("Int. to Software Engineering");

        Student student1 = new Student();
        // student1.name = "Akin Kaldiroglu";
        student1.setName("Akın Kaldiroğlu");









        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        //department1.head = professor1;
        //professor1.department = department1;
        department1.setHead(professor1);
        professor1.setDepartment(department1);

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
//        course1.department = department1;
//        department1.courses = new Course[100];
//        department1.courses[0] = course1;
        course1.setDepartment(department1);
        department1.setCourses(new Course[100]);
        department1.getCourses()[0] = course1;


        //course1.teacher = professor1;
        course1.setTeacher(professor1);
        // professor1.coursesGiven = new Course[5];
        professor1.setCoursesGiven(new Course[5]);
        professor1.getCoursesGiven()[0] = course1;

//        professor1.advisee = new Student[10];
//        professor1.advisee[0] = student1;
//        student1.advisor = professor1;

        professor1.setAdvisee(new Student[10]);
        professor1.getAdvisee()[0] = student1;
        student1.setAdvisor(professor1);

//        student1.coursesTaken = new Course[7];
//        student1.coursesTaken[0] = course1;
        student1.setCoursesTaken(new Course[7]);
        student1.getCoursesTaken()[0] = course1;

//        course1.students = new Student[100];
//        course1.students[0] = student1;
        course1.setStudents(new Student[100]);
        course1.getStudents()[0] = student1;

//        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
//        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
//        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);

        Classroom classroom1 = new Classroom();
        classroom1.setCoursesTaken(3);
        classroom1.setClassroomName("H/1");
        classroom1.setStudentCapacity(85);




        /*
        System.out.println("Name of student student1's first course is "
                + student1.getCoursesTaken()[0].getName());
        System.out.println("Name of student student1's first course's professor is "
                + student1.getCoursesTaken()[0].getTeacher().getName());
        System.out.println("Name of student student1's first course's professor's department is "
                + student1.getCoursesTaken()[0].getTeacher().getDepartment().getName());
                */

        System.out.println("Name of student student1's first course is "
                + student1.getCoursesTaken()[0].getName() + " and takes course in classroom " + classroom1.getClassroomName() +
                ". Clasrooms capacity is " + classroom1.getStudentCapacity() + " and there are " + classroom1.getCoursesTaken() + " courses taken here.");

        System.out.println(classroom1.toString());

    }
}
