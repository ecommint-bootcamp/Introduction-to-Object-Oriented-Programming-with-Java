package hw4.app;

import hw4.domain.Student;
import hw4.repository.jpa.StudentJpaDao;

public class Test {

	public static void main(String[] args) {
		StudentJpaDao dao = new StudentJpaDao();
		
		Student p = new Student();
		p.setId(8);
		p.setFirstName("Burak");
		p.setLastName("Genc");
		System.out.println("Persisting: " + p);

		dao.saveStudent(p);
		//dao.retrievePerson(1);
		//dao.retrieveAllPersons();
		//dao.updatePerson(p);
		//dao.deletePerson(p);
		//dao.deleteAllPersons();
	}

}
