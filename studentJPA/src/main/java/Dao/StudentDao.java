package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface StudentDao {
    EntityManager getEntityManager();
    EntityTransaction getEntityTransaction();
}
