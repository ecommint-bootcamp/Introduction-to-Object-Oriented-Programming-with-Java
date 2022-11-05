package hw1.coksekillilik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationOffice extends Student{

    public RegistrationOffice() {

    }


    public Student getAStudent(){

        Student s= new Student(144,"test",2, new Date(),"Tester");

      if (s instanceof GraduateStudent) {
      GraduateStudent ss= (GraduateStudent) s;
      ss.study();
      return ss;

    } else if (s instanceof MasterStudent) {
          MasterStudent ss= (MasterStudent) s;
          ss.study();
          return ss;
      }else if (s instanceof PhdStudent) {
          PhdStudent ss = (PhdStudent) s;
          ss.study();
          return ss;
      }else if (s instanceof UndergraduateStudent ) {
          UndergraduateStudent ss = (UndergraduateStudent) s;
          ss.study();
          return ss;
      } else if (s instanceof VocationalStudent) {
          VocationalStudent ss = (VocationalStudent) s;
          ss.study();
          return ss;
      }

        s.study();
        return s;
    }

    public void registerStudent(Student s){
        s.register();
    }


    public static void main(String[] args) {
        RegistrationOffice office = new RegistrationOffice();

        office.registerStudent(new GraduateStudent(756, "Graduate Student", 4, new Date(), "Computer Science", "Ali Kisisi", "Iyi seyler"));

        office.registerStudent(new MasterStudent(123, "Master Student", 2, new Date(), "Data Science", "Veli Kisisi", "Cok karmasik seyler"));

        office.registerStudent(new UndergraduateStudent(489, "Undergraduate Student", 4, new Date(), "Software Engineering", "Computer Science"));

        office.registerStudent(new PhdStudent(145, "PHD Student", 4, new Date(), "System Architecture", "Deli Kisisi", "Ne yaptin moruk", true));

        office.registerStudent(new VocationalStudent(1520, "Vocational Student", 4, new Date(), "MIT"));

        System.out.println();
        System.out.println();
        System.out.println();

        Student student=office.getAStudent();
        System.out.println(student);
    }



}
