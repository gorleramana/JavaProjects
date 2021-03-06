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
 */
@Entity // (name="USER_DETAILS") - Hibernate will automatically takes the class name as
		// db name , but if we want to give a specific name to db table, use name
@Table(name = "USER_DETAILS") // use this when table should have a specific name not as class name (similar to
								// above, but in hql u see the diff)
public class UserDetails3 {
	// represents primary key
	 //when I don't want to pass this, hibernate will take care of generating primary key if you use @GeneratedValue
	@Id @GeneratedValue(strategy=GenerationType.AUTO) //strategy: we are letting hibernate take decision on creating primary key as auto
	// @Column (name="USER_ID") - to have specific name in column in your db
	private int userId;
	//@Transient // hibernate automatically takes care of data type while inserting the
				// properties from here, if you don't want to insert any of such properties, you
				// can mention it as transient or static, it'll not insert it
	private String userName;
	//@Temporal (TemporalType.DATE)//hibernate by default save this as timestamp date, if you want to only save the date without time, use temporal annotation
	//private Date joiningDate;
	//private String address;
	@Lob //hibernate by default takes varchar 255, but when we need more space for some property we need to use @Lob annotation 
	//private String description;
	
	@Embedded 
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the joiningDate
	 */
//	public Date getJoiningDate() {
//		return joiningDate;
//	}

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
//	public void setJoiningDate(Date joiningDate) {
//		this.joiningDate = joiningDate;
//	}

	/**
	 * @return the address
	 */
//	public String getAddress() {
//		return address;
//	}

	/**
	 * @param address
	 *            the address to set
	 */
//	public void setAddress(String address) {
//		this.address = address;
//	}

	/**
	 * @return the description
	 */
//	public String getDescription() {
//		return description;
//	}

	/**
	 * @param description
	 *            the description to set
	 */
//	public void setDescription(String description) {
//		this.description = description;
//	}
}
