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
public class ParameterBindingAndSQLInjectionTest {

	public static void main(String args[]) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		String minUserId = "5 or 1=1";
		/**
		 * Using query - we are retrieving the table no of rows using class name not table name
		 */
		Query query = session.createQuery("select userName from TsPeDeDTO where userId>"+minUserId);//to get only username as string
		/**
		 * Pagination
		 */
		query.setFirstResult(0);
		query.setMaxResults(2);
		/**
		 * you'll get list of Objects
		 */
		List<TsPeDeDTO> list = (List<TsPeDeDTO>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		for(TsPeDeDTO ts: list) {
			System.out.println("User:"+ts.getUserName());
		}
	}
}