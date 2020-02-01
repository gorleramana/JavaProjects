/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.Address;
import org.javabrains.practice.hibernate.dto.EmbeddedObjectsDTO;

/**
 * @author RamanaGorle
 *
 *         Benefits of hibernate:
 *
 *         Hibernates allows us to focus on business logic, eliminating all the
 *         boiler-plate code that comes with JDBC and handles the resources.
 *         Code implementation becomes independent as Hibernate framework
 *         provides the support for XML and also to the JPA annotations. HQL is
 *         powerful Query Language which is similar to SQL, and HQL understands
 *         the concepts of polymorphism, inheritance, and association, which
 *         makes it fully object-oriented. Better performance can be achieved by
 *         Hibernate cache. It supports Lazy initialization with the use of
 *         proxy objects and when required performs actual database queries. We
 *         can execute native SQL queries using hibernate for vendor specific
 *         feature.
 */
public class EmbeddedObjects {

	public static void main(String args[]) {
		EmbeddedObjectsDTO eo = new EmbeddedObjectsDTO();
		eo.setUsername("First User");

		/**
		 * embedded example
		 */
		Address homeAddress = new Address();
		homeAddress.setStreet("123 Main St");
		homeAddress.setCity("Seattle");
		homeAddress.setState("Washington");
		homeAddress.setCountry("USA");
		homeAddress.setPincode("600019");
		eo.setHomeAddress(homeAddress);

		Address officeAddress = new Address();
		officeAddress.setStreet("123 Main St  1");
		officeAddress.setCity("Seattle 1");
		officeAddress.setState("Washington 1");
		officeAddress.setCountry("USA 1");
		officeAddress.setPincode("600019 1");
		eo.setOfficeAddress(officeAddress);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		session.save(eo);// saving your user object
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session

	}
}
