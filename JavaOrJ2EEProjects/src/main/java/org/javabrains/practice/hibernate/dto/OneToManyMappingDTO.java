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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author RamanaGorle
 *
 */
@Entity 
@Table(name = "ONE_TO_MANY_MAPPING")
public class OneToManyMappingDTO {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int userId;
	private String userName;
	
	@OneToMany //to map one to many relationship in between both DTO's
	@JoinTable(joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns = @JoinColumn(name="VEHICLE_ID"))
	private Collection<VehicleDTO> vehicles = new ArrayList<>();
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
	public Collection<VehicleDTO> getVehicle() {
		return vehicles;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Collection<VehicleDTO> vehicle) {
		this.vehicles = vehicle;
	}

}
