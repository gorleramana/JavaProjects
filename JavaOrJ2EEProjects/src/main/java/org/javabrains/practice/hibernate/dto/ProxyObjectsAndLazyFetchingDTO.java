/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author RamanaGorle
 *
 */
@Entity 
@Table(name = "PROXY_OBJECTS_LAZY_EAGER")
public class ProxyObjectsAndLazyFetchingDTO {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int userId;
	private String userName;
	@ElementCollection (fetch=FetchType.EAGER)//by default it's lazy, because we close the session before printing the proxy user class data, making it eager and then we can see results. 
	@JoinTable (name="USER_ADDRESS_2",joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")//to generate primary keys for every child table in collections
	//Below - Defining child table primary keys properties how it has to be generated, it generates a new column in collections tables
	@CollectionId(columns= {@Column(name="ADDRESS_ID")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Address> listOfAddresses = new ArrayList<>();//hibernate automatically creates another table to insert this list 
	
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
	 * @return the listOfAddresses
	 */
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	/**
	 * @param listOfAddresses the listOfAddresses to set
	 */
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
}
