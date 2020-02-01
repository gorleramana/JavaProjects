/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author RamanaGorle
 *
 *         hibernate automatically will create child table entries also in
 *         single table , it also maps the tables using a new column dtype
 */
public class HQLAndQueryTest {

	public static void main(String args[]) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		/**
		 * Using query - we are retrieving the table no of rows using class name not table name
		 */
		Query query = session.createQuery("from TsPeDeDTO where userid>12");
		List list = query.list();
		
		session.getTransaction().commit();
		session.close();
		System.out.println("List size: "+list.size());
	}
}