/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author RamanaGorle
 *
 */
@Entity
@Table(name = "EMBEDDED_OBJECTS")
public class EmbeddedObjectsDTO {
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int userId;
	private String userName;
	@Embedded 
	@AttributeOverrides({//To override multiple attributes
		@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
		@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
		@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
		@AttributeOverride(name="country", column=@Column(name="HOME_COUNTRY_NAME")),
		@AttributeOverride(name="pincode", column=@Column(name="HOME_PINCODE_NAME"))
	})
	private Address homeAddress;//when you have multiple addresses, you need specific column name for all the columns in each address
	
	@Embedded 
	@AttributeOverrides({//To override multiple attributes
		@AttributeOverride(name="street", column=@Column(name="OFFICE_STREET_NAME")),
		@AttributeOverride(name="city", column=@Column(name="OFFICE_CITY_NAME")),
		@AttributeOverride(name="state", column=@Column(name="OFFICE_STATE_NAME")),
		@AttributeOverride(name="country", column=@Column(name="OFFICE_COUNTRY_NAME")),
		@AttributeOverride(name="pincode", column=@Column(name="OFFICE_PINCODE_NAME"))
	})
	private Address officeAddress;
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
	 * @return the address
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @param address the address to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the address
	 */
	public Address getOfficeAddress() {
		return officeAddress;
	}

	/**
	 * @param address the address to set
	 */
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
}
