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
public class FourWheeler2 extends TablePerClassStrategyDTO {

	private String steeringWheel;

	/**
	 * @return the steeringWheel
	 */
	public String getSteeringWheel() {
		return steeringWheel;
	}

	/**
	 * @param steeringWheel the steeringWheel to set
	 */
	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
}
