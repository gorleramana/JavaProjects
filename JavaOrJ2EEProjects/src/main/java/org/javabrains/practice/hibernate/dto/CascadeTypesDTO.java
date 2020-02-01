/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author RamanaGorle
 *
 */
@Entity
@Table(name = "CASCADE_TYPES")
public class CascadeTypesDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;

	/**
	 * TO avoid saving every collection entity separately in session, we will use
	 * the cascade types to save, remove and etc. It'll automatically save all the
	 * entities in collection
	 */
	@OneToMany(cascade = CascadeType.PERSIST)
	private Collection<VehicleDTO3> vehicles = new ArrayList<>();

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return userName;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.userName = username;
	}

	/**
	 * @return the vehicle
	 */
	public Collection<VehicleDTO3> getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setVehicles(Collection<VehicleDTO3> vehicle) {
		this.vehicles = vehicle;
	}

}
