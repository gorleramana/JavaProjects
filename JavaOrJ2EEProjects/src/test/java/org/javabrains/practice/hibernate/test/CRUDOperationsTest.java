/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.CRUDOperationsDTO;

/**
 * @author RamanaGorle
 *
 *         hibernate automatically will create child table entries also in
 *         single table , it also maps the tables using a new column dtype
 */
public class CRUDOperationsTest {

	public static void main(String args[]) {
		/**
		 * Perform create, update and delete operations.
		 */

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		/**
		 * create
		 */
//		for (int i = 0; i < 10; i++) {
//			CRUDOperationsDTO c = new CRUDOperationsDTO();
//			c.setUserName("User" + i);
//			session.save(c);
//		}
		/**
		 * Select
		 */
//		CRUDOperationsDTO selectCrud = (CRUDOperationsDTO) session.get(CRUDOperationsDTO.class, 4);
//		System.out.println(selectCrud.getUserName());
		/**
		 * Delete
		 */
//		CRUDOperationsDTO selectCrud = (CRUDOperationsDTO) session.get(CRUDOperationsDTO.class, 4);
//		session.delete(selectCrud);
		/**
		 * Update
		 */
		CRUDOperationsDTO selectCrud = (CRUDOperationsDTO) session.get(CRUDOperationsDTO.class, 5);
		selectCrud.setUserName("I am updated person");
		session.update(selectCrud);
		
		session.getTransaction().commit();
		session.close();

	}
}