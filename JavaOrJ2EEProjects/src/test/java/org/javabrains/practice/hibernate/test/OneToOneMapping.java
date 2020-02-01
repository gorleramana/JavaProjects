/**
 * 
 */
package org.javabrains.practice.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.practice.hibernate.dto.OneToOneMappingDTO;
import org.javabrains.practice.hibernate.dto.VehicleDTO;

/**
 * @author RamanaGorle
 *
 *         It is similar to the many-to-one association and the difference lies
 *         in the column that will be set as a unique one.The many-to-one
 *         element is used to define one-to-one association. To the defined
 *         variable a name attribute is set in the parent class and the column
 *         attribute is used to set column name in the parent table, which is
 *         unique so that only one object gets associated with another.
 */
public class OneToOneMapping {

	public static void main(String args[]) {
		OneToOneMappingDTO sc = new OneToOneMappingDTO();
		sc.setUsername("Ramana Gorle");

		VehicleDTO vehicle = new VehicleDTO();
		vehicle.setVehicleName("Royal Enfield");

		sc.setVehicle(vehicle);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();// create sessions from sf, opening session here
		session.beginTransaction();// you need to begin transaction, new transaction created
		session.save(sc);// saving your user object
		session.save(vehicle);
		session.getTransaction().commit();// end the transaction, need to commit it to end it
		session.close();// to close the current session
	}
}
