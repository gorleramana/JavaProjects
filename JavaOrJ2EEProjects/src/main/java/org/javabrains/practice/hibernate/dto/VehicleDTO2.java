/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author RamanaGorle
 *
 *         Difference between save and persist in Hibernate save Returns
 *         Serializable object persist Returns Void
 */
@Entity
public class VehicleDTO2 {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;

	@ManyToMany // (mappedBy="vehicle")//if we do not keep mappedBy, both dtos will create
				// mapping tables for each row
	private Collection<ManyToManyMappingDTO> list = new ArrayList<>();

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

	/**
	 * @return the list
	 */
	public Collection<ManyToManyMappingDTO> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(Collection<ManyToManyMappingDTO> list) {
		this.list = list;
	}
}
