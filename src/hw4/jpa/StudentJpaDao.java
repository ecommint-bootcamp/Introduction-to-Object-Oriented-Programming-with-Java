package hw4.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import hw4.contract.StudentDao;
import hw4.domain.Student;
import hw4.util.PersistenceUtil;

public class StudentJpaDao implements StudentDao {

	public StudentJpaDao() {
		PersistenceUtil.setPersistenceUnitName("persistence-unit");
	}

	@Override
	public void saveStudent(Student student) {
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(student);
		transaction.commit();
		em.close();

		System.out.println("Student saved");
	}

	@Override
	public Student getStudentById(int id) {
		EntityManager em = PersistenceUtil.getEntityManager();

		Student student = em.find(Student.class, id);
		em.close();

		if (student == null) {
			System.out.println("Student not found");
			return null;
		} else {
			return student;
		}
	}

	@Override
	public List<Student> listAllStudent() {
		EntityManager em = PersistenceUtil.getEntityManager();
		Query listAllStudent = em.createQuery("Select s From students s");
		List<Student> students = listAllStudent.getResultList();
		em.close();
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Student updatedStudent = em.merge(student);
		if(updatedStudent == null) {
			System.out.println("Student not found");
		}
		else {
			System.out.println("student has been updated");
		}
		
		transaction.commit();
		em.close();
	}

	@Override
	public void deleteStudent(int id) {
		EntityManager em = PersistenceUtil.getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		Student deletedStudent = em.find(Student.class, id);

		if (deletedStudent == null) {
			System.out.println("student not found");
		} else {
			em.remove(deletedStudent);
			System.out.println("Student has been removed");
		}

		transaction.commit();
		em.close();
	}

}
