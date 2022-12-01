package main.java.com.ozlem.homework.dataservice;

import main.java.com.ozlem.homework.contract.StudentDAOI;
import main.java.com.ozlem.homework.datamodel.Student;
import main.java.util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;


public class StudentJpaDAO implements StudentDAOI {

    public StudentJpaDAO() {
        PersistenceUtil.setPersistenceUnitName("persistenceUnit");
    }

    public void saveStudent(Student student) {
        System.out.println("Student" + student + "is being saved...\n");
        EntityManager em= PersistenceUtil.getEntityManager();

        EntityTransaction tr=em.getTransaction();
        tr.begin();
        em.persist(student);
        tr.commit();
        em.close();

        System.out.println("Student " + student.getFirstName() + student.getLastName() + " is saved! ");
    }

    public Student retrieveStudent(int id) {
        System.out.println("Student " + id + " is being retrieved...\n");
        EntityManager em=PersistenceUtil.getEntityManager();

        Student studentRetrieved=em.find(Student.class, id);
        em.close();
        if(studentRetrieved == null){
            System.out.println("No such student with id = " + id);
            return null;
        }else{
            return studentRetrieved;
        }
    }

    public List<Student> retrieveAllStudents() {
        System.out.println("Retrieving all students...\n");
        EntityManager em=PersistenceUtil.getEntityManager();

        Query students=em.createQuery("Select s from Student s");
        List<Student> studentList= students.getResultList();
        System.out.println(studentList.size() + " students found.");
        em.close();

        return studentList;
    }

    public void updateStudentDOB(Student student) {
        System.out.println("Updating student " + student.getFirstName() + student.getLastName() +"...\n");
        EntityManager em=PersistenceUtil.getEntityManager();
        EntityTransaction tr= em.getTransaction();
        tr.begin();
        Student updatedStudent = em.merge(student);
        if(updatedStudent ==null){
            System.out.println("No such student with id= " + student.getId());
            System.out.println("No student updated!");
        }else{
            System.out.println("Student updated!");
        }
        tr.commit();
        em.close();
    }

    public void deleteStudent(Student student) {
        System.out.println("Deleting student " + student.getFirstName() + student.getLastName() +"...\n");
        EntityManager em=PersistenceUtil.getEntityManager();
        EntityTransaction tr= em.getTransaction();
        tr.begin();
        Student studentToDelete= em.find(Student.class,student.getId());
        if(studentToDelete ==null){
            System.out.println("No such student with id= " + student.getId());
            System.out.println("No student deleted!");
        }else{
            em.remove(studentToDelete);
            System.out.println("Student deleted!");
        }

        tr.commit();
        em.close();

    }

    public void deleteAllStudents() {
        System.out.println("Deleting all students...\n");
        EntityManager em=PersistenceUtil.getEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        Query students=em.createQuery("Select s from Student s");
        List<Student> studentList = students.getResultList();
        for(Student student:studentList)
            em.remove(student);
        System.out.println(studentList.size() + " students deleted!");
        tr.commit();
        em.close();

    }
}