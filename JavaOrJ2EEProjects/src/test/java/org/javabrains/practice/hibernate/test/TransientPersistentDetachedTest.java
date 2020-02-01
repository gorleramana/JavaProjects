/**
 * 
 */
package org.javabrains.practice.hibernate.test;

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
public class TransientPersistentDetachedTest {

	public static void main(String args[]) {
		//TsPeDeDTO ts = new TsPeDeDTO();
		/**
		 * transient - object is yet to save, can't make any update on this
		 */
		//ts.setUserName("I am transient");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		TsPeDeDTO ts = (TsPeDeDTO) session.get(TsPeDeDTO.class, 13);
		//session.save(ts);
		/**
		 * Persistent - the object is already saved, we can do update
		 */
		//if you do session.delete(). persistent object becomes transient again
		
		//ts.setUserName("updated transient");//it'll be still updated because your session is still open
		//ts.setUserName("updated transient Again");
		
		session.getTransaction().commit();
		session.close();
		/**
		 * Detached - session closed , can't save
		 */
		//ts.setUserName("updated transient Again and Again");//never be update 
		
		/**
		 * Making detached to persistent again as below
		 */
		ts.setUserName("make it to persistent");
		
		session = sf.openSession();
		session.beginTransaction();
		session.update(ts);
		ts.setUserName("Updated persist user here ");
		session.getTransaction().commit();
		session.close();
	}
}