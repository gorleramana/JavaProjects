/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author RamanaGorle
 *
 */
@Embeddable //it should be part of some other class, can't be independent 
public class Address {
	@Column (name="STREET")//TO have specific column name in db
	private String street;
	@Column (name="CITY")
	private String city;
	@Column (name="STATE")
	private String state;
	@Column (name="COUNTRY")
	private String country;
	@Column (name="PIN_CODE")
	private String pincode;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
