/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author RamanaGorle
 *
 *         Hibernate is a free software, which is distributed under GNU Lesser
 *         General public license 2.1. It is categorized under the Object
 *         Relational Mapping (ORM), which features the mapping of Java classes
 *         to data tables and mapping from Java data types to SQL data types. It
 *         is written in Java and is JVM (Java Virtual Machine) platform based.
 *         
 *         Hibernate provides the data query and retrieval facilities. It is one
 *         of the most widely used ORM tools for the Java applications.
 *         
 *         Hibernate is highly considered to be used in the enterprise
 *         applications for database operations.
 */
@Entity // (name="USER_DETAILS") - Hibernate will automatically takes the class name as
		// db name , but if we want to give a specific name to db table, use name
@Table(name = "USER_DETAILS") // use this when table should have a specific name not as class name (similar to
								// above, but in hql u see the diff)
public class UserDetails {
	// represents primary key
	// when I don't want to pass this, hibernate will take care of generating
	// primary key if you use @GeneratedValue
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // strategy: we are letting hibernate take decision on creating
													// primary key as auto
	// @Column (name="USER_ID") - to have specific name in column in your db
	private int userId;
	// @Transient // hibernate automatically takes care of data type while inserting
	// the
	// properties from here, if you don't want to insert any of such properties, you
	// can mention it as transient or static, it'll not insert it
	private String userName;
	// @Temporal (TemporalType.DATE)//hibernate by default save this as timestamp
	// date, if you want to only save the date without time, use temporal annotation
	// private Date joiningDate;
	// private String address;
	@Lob // hibernate by default takes varchar 255, but when we need more space for some
			// property we need to use @Lob annotation
	// private String description;

	@Embedded
	@AttributeOverrides({ // To override multiple attributes
			@AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
			@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
			@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
			@AttributeOverride(name = "country", column = @Column(name = "HOME_COUNTRY_NAME")),
			@AttributeOverride(name = "pincode", column = @Column(name = "HOME_PINCODE_NAME")) })
	private Address homeAddress;// when you have multiple addresses, you need specific column name for all the
								// columns in each address

	@Embedded
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
	// @Column (name="USER_ID") //you can even mention the specific name to your
	// column in table here also
	public void setUsername(String username) {
		this.userName = username;// +"from getter";- it'll not only takes the username entered by user but also
									// appends this string before insertion
	}

	/**
	 * @return the address
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @param address
	 *            the address to set
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
	 * @param address
	 *            the address to set
	 */
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	/**
	 * @return the joiningDate
	 */
	// public Date getJoiningDate() {
	// return joiningDate;
	// }

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	// public void setJoiningDate(Date joiningDate) {
	// this.joiningDate = joiningDate;
	// }

	/**
	 * @return the address
	 */
	// public String getAddress() {
	// return address;
	// }

	/**
	 * @param address
	 *            the address to set
	 */
	// public void setAddress(String address) {
	// this.address = address;
	// }

	/**
	 * @return the description
	 */
	// public String getDescription() {
	// return description;
	// }

	/**
	 * @param description
	 *            the description to set
	 */
	// public void setDescription(String description) {
	// this.description = description;
	// }
}
