/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.Address;
import org.javabrains.practice.hibernate.dto.UserDetails;
import org.javabrains.practice.hibernate.dto.UserDetails3;
import org.javabrains.practice.hibernate.dto.EmbeddedObjectsDTO;

/**
 * @author RamanaGorle
 *
 *         The Key components of Hibernate are:
 * 
 *         Session: It is used to get a physical network with a database.
 * 
 *         Transaction: It represents the unit of work with a database.
 * 
 *         Query: It uses SQL and HQL string to retrieve the data from the
 *         database and create objects.
 * 
 *         Criteria: It is used create and execute object-oriented queries and
 *         retrieve the objects.
 * 
 *         Configuration: It represents the properties of files required by
 *         Hibernate
 * 
 *         Session Factory: It configures hibernate for the application using
 *         the provided configuration file and instantiates the session object.
 * 
 */
public class HibernateTest {

	public static void main(String args[]) {
		UserDetails3 ud = new UserDetails3();
		// ud.setUserId(1); //it'll be generated automatically when i give
		// @generatedvalue annotation
		ud.setUsername("First User");
		// ud.setAddress("123 Main st, Bellevue WA");
		// ud.setJoiningDate(new Date());
		// ud.setDescription("Doing super job");

		// UserDetails ud2 = new UserDetails();
		// ud2.setUsername("Second User");

		// Configuration gets the hibernate configuration from cfg.xml file
		// we create only once, very expensive, takes lot of resources
		// to create, once for every application
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		session.save(ud);// saving your user object
		// session.save(ud2);
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session

		// ud = null;
		// session = sf.openSession();// new session
		// session.beginTransaction();
		// ud = (UserDetails) session.get(UserDetails.class, 1);//passing primary key,
		// which hibernate already knows it
		// System.out.println(ud.getUsername()+" is the username retreived.."); //will
		// retrieve the username of the primary key
	}
}
