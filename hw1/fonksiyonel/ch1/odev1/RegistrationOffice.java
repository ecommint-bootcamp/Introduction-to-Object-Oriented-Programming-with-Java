package hw1.fonksiyonel.ch1.odev1;

public class RegistrationOffice {

	public RegistrationOffice() {

	}

	public void getAStudent(Student student) {

	}

	public void registerStudent(Student student) {

	}

	public static void main(String[] args) {

		Student s1 = new Student(45, "Semih", 2015, 1996, "Psychology");
		if (s1 instanceof UndergraduateStudent) {
			System.out.println(s1.getName() + " is an undergraduate student.");
		} else {
			System.out.println(s1.getName() + " is not an undergraduate student.");
		}
		System.out.println("----------");

		// upcasting
		VocationalStudent s2 = new VocationalStudent(1, "Semih", 2015, 1996, "Software Develeopment");
		if (s2 instanceof VocationalStudent) {
			System.out.println(s2.getName() + " is a Vocational student and also an instance of Student.");

		} else {
			System.out.println(s2.getName() + " is not a Vocational student.");
		}

		System.out.println("------------");

		
		// downcasting

		Student s3 = new Student(25, "Semih", 2015, 1996, "Software Development");
		if (s3 instanceof PhdStudent) {
			System.out.println("s3 is an istance of PhdStudent");
			PhdStudent pStudent = (PhdStudent) s3;
			pStudent.register();
		} else if (s3 instanceof GraduateStudent) {
			System.out.println("s3 is an instance of GraduateStudent");
			GraduateStudent graduateStudent = (GraduateStudent) s3;
			graduateStudent.register();
		} else if (s3 instanceof Student) {
			System.out.println("s3 is an instance of Student");

		} else {
			System.out.println("s3 is not an instance of Student.");
		}

	}

}
