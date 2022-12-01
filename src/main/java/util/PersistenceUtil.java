package main.java.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

    private static String persistenceUnitName;
    private static EntityManagerFactory entityManagerFactory;


    public static void setPersistenceUnitName(String persistenceUnitName) {
        PersistenceUtil.persistenceUnitName = persistenceUnitName;

        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
    }

    public static String getPersistenceUnitName() {
        return persistenceUnitName;
    }


    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }


    public static synchronized EntityManagerFactory getEntityManagerFactory(String persistenceUnitName) {
        setPersistenceUnitName(persistenceUnitName);
        return entityManagerFactory;
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void close() {
        entityManagerFactory.close();
    }


    public static void main(String[] args) {
        System.out.println("In main");
		//close();
    }
}
