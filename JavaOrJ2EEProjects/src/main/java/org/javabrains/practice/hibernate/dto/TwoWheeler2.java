/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author RamanaGorle
 *
 */
@Entity
//@DiscriminatorValue("Bike")
public class TwoWheeler2 extends TablePerClassStrategyDTO {

	private String steeringHandle;

	/**
	 * @return the steeringHandle
	 */
	public String getSteeringHandle() {
		return steeringHandle;
	}

	/**
	 * @param steeringHandle the steeringHandle to set
	 */
	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
}
