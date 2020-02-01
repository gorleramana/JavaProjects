/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author RamanaGorle
 *
 */
@Entity 
@Table(name = "MANY_TO_MANY_MAPPING")
public class ManyToManyMappingDTO {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int userId;
	private String userName;
	
	@ManyToMany //to map many to many relationship in between both DTO's
	private Collection<VehicleDTO2> vehicles = new ArrayList<>();
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
	public Collection<VehicleDTO2> getVehicle() {
		return vehicles;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Collection<VehicleDTO2> vehicle) {
		this.vehicles = vehicle;
	}

}
