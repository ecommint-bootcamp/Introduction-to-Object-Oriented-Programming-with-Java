package egecoskun.student;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class RegistrationOffice {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public RegistrationOffice() {
    }

    public Student getAStudent(){


        return registerStudent(new UnderGraduateStudent(1,"Ege",2020,new Date(1998, Calendar.MARCH,1),"Software Engineering","Highc"));
    }
    public Student registerStudent(Student student){

        return student;
    }
}
