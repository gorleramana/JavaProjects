/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * @author RamanaGorle
 *
 *         Difference between save and persist in Hibernate save Returns
 *         Serializable object persist Returns Void
 */
@Entity
public class VehicleDTO3 {
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;

//	@NotFound(action = NotFoundAction.IGNORE) // This will be used when the below class is not available for mapping
//	private CascadeTypesDTO cascadeTypesDTO;

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
