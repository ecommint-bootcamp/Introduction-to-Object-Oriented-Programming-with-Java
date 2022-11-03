package polymorphism;

public class Test {
    public static void main(String[] args) {
        RegistrationOffice office = new RegistrationOffice();

        // Student student = new Student(1, "Bekir", 2020, new Date(),
        // "ComputerEngineer");
        // Student vocationalStudent = new VocationalStudent(1, "Mehmet", 2020, new
        // Date(), "Computer Engineer");
        // Student graduateStudent = new GraduateStudent(1, "Ahmet", 2010, new Date(),
        // "Computer", "Ali", "Data Science");
        // Student phpStudent = new PhdStudent(1, "Burak", 2015, new Date(), "null",
        // "null", "null", false);

        office.registerStudent(office.getAStudent());
    }
}
