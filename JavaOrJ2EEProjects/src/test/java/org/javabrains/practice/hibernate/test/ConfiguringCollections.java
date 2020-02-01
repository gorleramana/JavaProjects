/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.Address;
import org.javabrains.practice.hibernate.dto.ConfiguringCollectionsDTO;

/**
 * @author RamanaGorle
 *
 */
public class ConfiguringCollections {

	/**
	 * Hibernate supports HSQL Database Engine, DB2/NT, Oracle, Microsoft SQL Server
	 * Database, Sybase SQL Server, Informix Dynamic Server, MySQL, PostgreSQL,
	 * FrontBase
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ConfiguringCollectionsDTO sc = new ConfiguringCollectionsDTO();
		sc.setUsername("First User");

		Address a1 = new Address();
		a1.setStreet("123 Main St");
		a1.setCity("Seattle");
		a1.setState("Washington");
		a1.setCountry("USA");
		a1.setPincode("600019");
		sc.getListOfAddresses().add(a1);

		Address a2 = new Address();
		a2.setStreet("123 Main St");
		a2.setCity("Seattle");
		a2.setState("Washington");
		a2.setCountry("USA");
		a2.setPincode("600019");
		sc.getListOfAddresses().add(a2);

		Address a3 = new Address();
		a3.setStreet("123 Main St");
		a3.setCity("Seattle");
		a3.setState("Washington");
		a3.setCountry("USA");
		a3.setPincode("600019");
		sc.getListOfAddresses().add(a3);

		/**
		 * It is an immutable thread safe cache of compiled mappings for a single
		 * database. We are supposed to initialize SessionFactory once and then we are
		 * allowed to cache and reuse it. The SessionFactory instance is used to return
		 * the session objects for database operations.
		 */
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		/**
		 * Session is used to get a physical connection with a database. A session
		 * object is designed to instantiate each time an interaction is required with
		 * the database, whereas the persistent objects are retrieved using a session
		 * object. The session objects are not thread-safe and must be created and
		 * destroyed as per the requirement.
		 */
		Session session = sf.openSession();
		session.beginTransaction();// you need to begin transaction, new transaction created
		session.save(sc);// saving your user object
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session

	}
}
