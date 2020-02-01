/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.FourWheeler2;
import org.javabrains.practice.hibernate.dto.InheritanceWithJoinedStrategyDTO;
import org.javabrains.practice.hibernate.dto.TwoWheeler2;

/**
 * @author RamanaGorle
 *
 *         hibernate automatically will create child table entries also in
 *         single table , it also maps the tables using a new column dtype
 */
public class InheritanceWithJoinedStrategy {

	public static void main(String args[]) {
		/**
		 * We'll have to to join while querying the data in DB in order to get join tables data. 
		 */
		InheritanceWithJoinedStrategyDTO joined = new InheritanceWithJoinedStrategyDTO();
		joined.setVehicleName("Table per class vehicle");

		TwoWheeler2 two = new TwoWheeler2();
		two.setVehicleName("Bike");
		two.setSteeringHandle("Bike steering handle");

		FourWheeler2 four = new FourWheeler2();
		four.setVehicleName("Car");
		four.setSteeringWheel("Car steering wheel");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(joined);
		session.save(two);
		session.save(four);

		session.getTransaction().commit();
		session.close();
		
	}
}