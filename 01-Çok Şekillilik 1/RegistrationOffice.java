public class RegistrationOffice {
    private Student student;
    
    public RegistrationOffice() {
    }

    public Student getAStudent(){
        return student;
    }

    public void registerStudent(Student student){
        System.out.println("Registered => "+ student);
    }
}
