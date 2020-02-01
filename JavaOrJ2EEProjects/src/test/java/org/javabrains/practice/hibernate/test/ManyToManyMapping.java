/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.ManyToManyMappingDTO;
import org.javabrains.practice.hibernate.dto.VehicleDTO2;

/**
 * @author RamanaGorle
 *
 *         The Many-to-Many element indicates the relation between one object to
 *         many other objects and column attribute is used to link intermediate
 *         columns. A Many-to-Many mapping is implemented using a Set Java
 *         collection that does not have any redundant element.
 */
public class ManyToManyMapping {

	public static void main(String args[]) {
		ManyToManyMappingDTO sc = new ManyToManyMappingDTO();
		sc.setUsername("Ramana Gorle");

		VehicleDTO2 vehicle = new VehicleDTO2();
		vehicle.setVehicleName("Royal Enfield");

		VehicleDTO2 vehicle2 = new VehicleDTO2();
		vehicle2.setVehicleName("Mazda6");

		sc.getVehicle().add(vehicle);
		sc.getVehicle().add(vehicle2);

		vehicle.getList().add(sc);
		vehicle2.getList().add(sc);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		session.save(sc);// saving your user object
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session
	}
}
