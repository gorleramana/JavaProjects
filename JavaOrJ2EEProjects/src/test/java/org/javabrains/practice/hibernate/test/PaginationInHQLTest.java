/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.TsPeDeDTO;

/**
 * @author RamanaGorle
 *
 *         hibernate automatically will create child table entries also in
 *         single table , it also maps the tables using a new column dtype
 */
public class PaginationInHQLTest {

	public static void main(String args[]) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		/**
		 * Using query - we are retrieving the table no of rows using class name not table name
		 */
		//Query query = session.createQuery("from TsPeDeDTO");//to get whole object
		Query query = session.createQuery("select userName from TsPeDeDTO");//to get only username as string
		/**
		 * Pagination
		 */
		query.setFirstResult(0);
		query.setMaxResults(2);
		/**
		 * you'll get list of Objects
		 */
		//List<TsPeDeDTO> list = (List<TsPeDeDTO>)query.list();
		//to get only username as list
		List<String> list = (List<String>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		for(String ts: list) {
			System.out.println("User:"+ts);
		}
	}
}