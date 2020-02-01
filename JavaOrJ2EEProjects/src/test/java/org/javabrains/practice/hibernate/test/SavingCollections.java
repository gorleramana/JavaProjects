/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.Address;
import org.javabrains.practice.hibernate.dto.SavingCollectionsDTO;

/**
 * @author RamanaGorle
 *
 */
public class SavingCollections {
	/**
	 * yet to work on these f/w's
	 */
	//private final static Logger sl4jlogger = LoggerFactory.getLogger(SavingCollections.class);

	public static void main(String args[]) {
		//sl4jlogger.info("Demo of the saving collections in DB");

		SavingCollectionsDTO sc = new SavingCollectionsDTO();

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
		 * Factory pattern in SessionFactory
		 */
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		/**
		 * Proxy Pattern for lazy loading
		 */
		session.save(sc);// saving your user object
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session

	}
}
