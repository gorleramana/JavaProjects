/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author RamanaGorle
 *
 *         Data Mapper design pattern – A layer of Mappers that moves data
 *         between objects and a database while keeping them independent of each
 *         other and the mapper itself.
 * 
 *         Domain Model Design Pattern – An object model of the domain that
 *         incorporates both behavior and data.
 */
@Entity
@Table(name = "ONE_TO_ONE_MAPPING")
public class OneToOneMappingDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;

	@OneToOne // to map one to one relationship in between both DTO's
	@JoinColumn(name = "VEHICLE_ID")
	private VehicleDTO vehicle;

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
	public VehicleDTO getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

}
