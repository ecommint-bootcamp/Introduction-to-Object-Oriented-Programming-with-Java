package hw4.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hw4.domain.Student;
import hw4.repository.StudentDao;
import hw4.util.PersistenceUtil;


public class StudentJpaDao implements StudentDao {

	public StudentJpaDao() {
		//with jpa.properties file
		PersistenceUtil.setPersistenceUnitName("student");
		
	}
	
	@Override
	public void saveStudent(Student student) {
		
		/* with persistence.xml file
		 
		 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student2");
		EntityManager em =entityManagerFactory.createEntityManager();
		*/
		System.out.println("Saving student:" + student + "\n");
		EntityManager em = PersistenceUtil.getEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(student);
		tx.commit();
		em.close();
		
		System.out.println("Student saved!");
	}
	@Override
	public Student retrieveStudent(int id) {
		System.out.println("Retrieving the student with id = " + id);
		EntityManager em = PersistenceUtil.getEntityManager();
		Student studentRetrieved = em.find(Student.class, id);
		em.close();
		if (studentRetrieved == null) {
			System.out.println("No such student with id = " + id);
			return null;
		} else {
			return studentRetrieved;
		}
	}

	@Override
	public List<Student> retrieveAllStudents() {
		System.out.println("\nRetrieving all students by query.");
		EntityManager em = PersistenceUtil.getEntityManager();
		Query allPersons = em.createQuery("Select s from STUDENTS s");
		List<Student> students = allPersons.getResultList();
		System.out.println(students.size() + " objects:");
		em.close();
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		System.out.println("Updating a student:" + student);
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student updatedPerson = em.merge(student);
		if(updatedPerson == null){
			System.out.println("No such student with id = " + student.getId());
			System.out.println("No student updated!");
		}
		else
			System.out.println("Student updated!");
		tx.commit();
		em.close();
		
	}

	@Override
	public void deleteStudent(Student student) {
		System.out.println("Deleting a student:" + student);
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student personToDelete = em.find(Student.class, student.getId());
		if(personToDelete == null){
			System.out.println("No such student with id = " + student.getId());
			System.out.println("No student deleted!");
		}
		else{
			em.remove(personToDelete);
			System.out.println("Student deleted!");
		}
		tx.commit();
		em.close();
	}

	@Override
	public void deleteAllStudents() {
		System.out.println("Deleting all students.");
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allPersons = em.createQuery("Select s from STUDENTS s");
		List<Student> students = allPersons.getResultList();
		for(Student student:students)
			em.remove(student);
		System.out.println(students.size() + " students deleted!");
		tx.commit();
		em.close();
		
	}
	
}
