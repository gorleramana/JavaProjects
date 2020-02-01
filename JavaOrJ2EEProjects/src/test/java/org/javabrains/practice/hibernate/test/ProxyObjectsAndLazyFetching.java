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
public class ProxyObjectsAndLazyFetching {

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

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		/**
		 * Lazy loading is a technique in where the objects are loaded on the requirement basis.
		 * Since the Hibernate 3 version, the lazy loading is by default enabled so that
		 * the child objects are not loaded while the parent is loaded.
		 */
		session.save(sc);// saving your user object
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session

		sc = null;
		session = sf.openSession();
		sc = (ConfiguringCollectionsDTO) session.get(ConfiguringCollectionsDTO.class, 1);
		session.close();// you'll get exception because proxy will not able to get class (testing proxy
						// user class).
		// hibernate by default do the lazy initialization using Proxy class
		// when hibernate gets the data, instead of giving it directly to user class, it
		// creates a proxy user class (which is sub class of user class), fills all the
		// values and it'll hand you the proxy user class to the user (this class will
		// not give the huge list of values to user immediately), when user actually
		// needs the list, proxy class calls it's parent user class and gives the data
		// to user
		System.out.println("Size of the address list: " + sc.getListOfAddresses().size());
	}
}
