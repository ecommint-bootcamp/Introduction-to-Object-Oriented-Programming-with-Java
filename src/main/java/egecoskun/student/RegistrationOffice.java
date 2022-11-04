package egecoskun.student;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class RegistrationOffice {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    List<Student> studentList;

    public RegistrationOffice() {
        studentList = new ArrayList<>();
    }

    public Student getAStudent(){
        return studentList.get((int)Math.random()*10);
    }
    public void registerStudent(Student student){
        studentList.add(student);
    }
}
