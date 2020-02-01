/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * In hibernate, the Java classes whose instances and objects are stored in
 * database classes are called persistent classes.
 * 
 * @author RamanaGorle
 *
 */
@Entity
public class VehicleDTO {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;

	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}

	/**
	 * @param vehicleId
	 *            the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}

	/**
	 * @param vehicleName
	 *            the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
