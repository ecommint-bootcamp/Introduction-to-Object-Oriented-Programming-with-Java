import Entity.Student;
import util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
    public Test() {
        PersistenceUtil.setPersistenceUnitName("persistence-unit");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.createPersonUsingEntityManagerFactory();
        PersistenceUtil.close();

    }

    public void updatePerson(Student student) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student studentMerged = em.merge(student);

        studentMerged.setLastName("XXXXX");

        student.setLastName("YYYYY");

        tx.commit();
        em.close();
    }

    public Student editPerson(int id) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student student = em.find(Student.class, id);
        if (student != null)
            System.out.println("Person retrieved: " + student);


        tx.commit();
        em.close();


        return student;
    }

    void createPersonUsingEntityManagerFactory() {
        System.err.println("Creating a person with a transaction using EntityManagerFactory.");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("entity");
        EntityManager em = entityManagerFactory.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student student = new Student();
      //  student.setId(student.getId());
        student.setFirstName("Semih");
        student.setLastName("Yildiz");
        System.out.println("Persisting: " + student);

        em.persist(student);
        tx.commit();
        em.close();
    }
    void createPersonUsingPersistenceUtil() {
        System.err.println("Creating a person with a transaction using PersistenceUtil.");
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student student = new Student();
     //   p.setId(createId());
        student.setFirstName("Selim");
        student.setLastName("Ozgur");
        System.err.println("Persisting: " + student);

        em.persist(student);
        tx.commit();
        em.close();
    }

    void createPersonWithoutTX() {
        System.err.println("Creating a person without a transaction.");
        EntityManager em = PersistenceUtil.getEntityManager();

        Student student = new Student();
        student.setId(101010101);
        student.setFirstName("Mihrimah");
        student.setLastName("Kaldiroglu");

        em.persist(student);
        em.close();
    }


    private void retrieveAStudent(int id) {
        System.err.println("\nRetrieving the student with id: " + id);
        EntityManager em = PersistenceUtil.getEntityManager();

        Student student = em.find(Student.class, id);
        if (student == null)
            System.out.println("No such student!");
        else
            System.out.println("\n" + student);
        em.close();
    }



}
