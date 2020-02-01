/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.CascadeTypesDTO;
import org.javabrains.practice.hibernate.dto.VehicleDTO3;

/**
 * @author RamanaGorle
 *
 *         Cascade types will be used to avoid saving every collection object separately
 */
public class CascadeTypes {

	public static void main(String args[]) {
		CascadeTypesDTO sc = new CascadeTypesDTO();
		sc.setUsername("Ramana Gorle");

		VehicleDTO3 vehicle = new VehicleDTO3();
		vehicle.setVehicleName("Royal Enfield");

		VehicleDTO3 vehicle2 = new VehicleDTO3();
		vehicle2.setVehicleName("Mazda6");

		sc.getVehicles().add(vehicle);
		sc.getVehicles().add(vehicle2);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		
		session.persist(sc);// saving your user object
		
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session
	}
}
