package polymorphism;

import java.util.Date;

public class RegistrationOffice {

    public RegistrationOffice() {
    }

    public Student getAStudent() {
        Student student = null;
        int i = (int) (4 * Math.random());

        switch (i) {
            case 0: {
                student = new Student(1, "Bekir", 2020, new Date(), "ComputerEngineer");
                break;
            }

            case 1: {
                student = new VocationalStudent(1, "Mehmet", 2020, new Date(), "Computer Engineer");
                break;
            }

            case 3: {
                student = new GraduateStudent(1, "Ahmet", 2010, new Date(),
                        "Computer", "Ali", "Data Science");
                break;
            }

            case 4: {
                student = new PhdStudent(1, "Beyza", 2015, new Date(), "Major", "Ahmet", "Ai", false);
                break;
            }
        }

        return student;
    }

    void registerStudent(Student student) {
        if (student instanceof PhdStudent) {
            PhdStudent phdStudent = (PhdStudent) student;
            System.out.println(
                    "Hello " + phdStudent.getName() + " Qualifying exam taken: " + phdStudent.getQualifyingExamTaken());
        }

        System.out.println(student.getName() + " has been registered.");
    }
}
