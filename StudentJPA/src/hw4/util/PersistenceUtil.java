package hw4.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.config.PersistenceUnitProperties;

public class PersistenceUtil {

	private static String persistenceUnitName;
	private static Properties properties = new Properties();
	private static EntityManagerFactory entityManagerFactory;
	
	//To load properties
	static{
		try(FileReader reader = new FileReader("jpa.properties")) {
			properties.load(reader);
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found!");
		} catch (IOException e) {
			System.out.println("Problem when reading properties file!");
		}
	}
	public static void setPersistenceUnitName(String persistenceUnitName){
		PersistenceUtil.persistenceUnitName = persistenceUnitName;	
		entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName, properties);
			
	}

	public static String getPersistenceUnitName() {
		return persistenceUnitName;
	}
	
	public static EntityManagerFactory getEntityManagerFactory(){
		return entityManagerFactory;
	}
	
	public static EntityManager getEntityManager(){
		return entityManagerFactory.createEntityManager();
	}
	
	public static void close(){
		 entityManagerFactory.close();
	}
	
}
