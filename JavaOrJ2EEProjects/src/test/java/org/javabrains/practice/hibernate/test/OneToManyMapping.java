/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.OneToManyMappingDTO;
import org.javabrains.practice.hibernate.dto.VehicleDTO;

/**
 * @author RamanaGorle
 *
 *         In this association, one object can be associated with multiple
 *         objects. The One-to-Many mapping is implemented using a Set Java
 *         collection that does not have any redundant element. A One-to-Many
 *         element of the set element indicates the relation of one object to
 *         multiple objects.
 *
 *         This association is the common type of association where one object
 *         can be associated with multiple objects. And Many-to-one element
 *         defines the Many-to-One association.To the defined variable, a name
 *         attribute is set in the parent class and column attribute sets the
 *         column name in the parent table.
 */
public class OneToManyMapping {

	public static void main(String args[]) {
		OneToManyMappingDTO sc = new OneToManyMappingDTO();
		sc.setUsername("Ramana Gorle");

		VehicleDTO vehicle = new VehicleDTO();
		vehicle.setVehicleName("Royal Enfield");

		VehicleDTO vehicle2 = new VehicleDTO();
		vehicle2.setVehicleName("Mazda6");

		sc.getVehicle().add(vehicle);
		sc.getVehicle().add(vehicle2);

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
