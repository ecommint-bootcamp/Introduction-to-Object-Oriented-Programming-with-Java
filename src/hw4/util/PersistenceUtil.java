package hw4.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
	private static String persistenceUnitName;

	public static String getPersistenceUnitName() {
		return persistenceUnitName;
	}

	public static void setPersistenceUnitName(String persistenceUnitName) {
		PersistenceUtil.persistenceUnitName = persistenceUnitName;

		entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);

		System.out.println(persistenceUnitName);
	}

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public static synchronized EntityManagerFactory getEntityManagerFactory(String persistenceUnitName){
		setPersistenceUnitName(persistenceUnitName);
		return entityManagerFactory;
	}

	public static void main(String[] args) {
		System.out.println("In main");
	}

}
