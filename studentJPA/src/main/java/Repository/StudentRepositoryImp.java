package Repository;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import Entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudentRepositoryImp implements StudentRepository {

    private StudentDao studentDao = new StudentDaoImpl();
    private EntityManager entityManager = studentDao.getEntityManager();
    private EntityTransaction transaction = studentDao.getEntityTransaction();

    @Override
    public void save(Student student) {
        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
    }

    @Override
    public Student findById(int id) {
        Student student = this.entityManager.find(Student.class, id);
        if (student != null) {
            return student;
        } else {
            return null;
        }
    }

    @Override
    public Student update(Student student) {
        Student update = this.entityManager.merge(student);
        return update;
    }

    @Override
    public void delete(int id) {
        transaction.begin();
        entityManager.remove(id);
        transaction.commit();
    }
}
