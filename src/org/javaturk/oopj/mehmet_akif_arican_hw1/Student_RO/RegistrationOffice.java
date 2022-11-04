import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class RegistrationOffice {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public RegistrationOffice() {
    }

    public Student getAStudent(){


        return registerStudent(new UndergraduateStudent(1,"Oğuz",2018 , new Date(1999, Calendar.SEPTEMBER,4),"Civil Engineering","Highc"));
    }

    public Student registeredStudent(Student student){
        return student;
    }
}

}