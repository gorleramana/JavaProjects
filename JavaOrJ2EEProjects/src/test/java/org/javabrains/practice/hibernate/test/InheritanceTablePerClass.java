/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.FourWheeler;
import org.javabrains.practice.hibernate.dto.SingleTableStrategyDTO;
import org.javabrains.practice.hibernate.dto.TablePerClassStrategyDTO;
import org.javabrains.practice.hibernate.dto.TwoWheeler;

/**
 * @author RamanaGorle
 *
 *         hibernate automatically will create child table entries also in
 *         single table , it also maps the tables using a new column dtype
 */
public class InheritanceTablePerClass {

	public static void main(String args[]) {
//		InheritanceDTO vehicle = new InheritanceDTO();
//		vehicle.setVehicleName("Royal Enfield");
//
//		TwoWheeler two = new TwoWheeler();
//		two.setSteeringHandle("Bike steering handle");
//
//		FourWheeler four = new FourWheeler();
//		four.setSteeringWheel("Car steering wheel");
		
		/**
		 * Single table strategy, default one in hibernate
		 */
		//SingleTableStrategyDTO single = new SingleTableStrategyDTO();
		//single.setVehicleName("Royal Enfield");
		
		TablePerClassStrategyDTO tablePerC = new TablePerClassStrategyDTO();
		tablePerC.setVehicleName("Table per class vehicle");

		TwoWheeler two = new TwoWheeler();
		two.setVehicleName("Bike");
		two.setSteeringHandle("Bike steering handle");

		FourWheeler four = new FourWheeler();
		four.setVehicleName("Car");
		four.setSteeringWheel("Car steering wheel");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		//session.save(vehicle);
		//session.save(single);
		session.save(tablePerC);
		session.save(two);
		session.save(four);

		session.getTransaction().commit();
		session.close();
	}
}