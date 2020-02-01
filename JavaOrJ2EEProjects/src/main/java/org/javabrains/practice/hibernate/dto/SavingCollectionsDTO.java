/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
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
@Table(name = "SAVING_COLLECTIONS")
public class SavingCollectionsDTO {
	/**
	 * Some of the best practices to follow in Hibernate are:
	 * 
	 * Always check the primary key field access, if it’s generated at the database
	 * layer then you should not have a setter for this.
	 * 
	 * By default hibernate set the field values directly, without using setters. So
	 * if you want hibernate to use setters, then make sure proper access is defined
	 * as @Access(value=AccessType.PROPERTY).
	 * 
	 * If access type is property, make sure annotations are used with getter
	 * methods and not setter methods. Avoid mixing of using annotations on both
	 * filed and getter methods.
	 * 
	 * Use native sql query only when it can’t be done using HQL, such as using
	 * database specific feature.
	 * 
	 * If you have to sort the collection, use ordered list rather than sorting it
	 * using Collection API.
	 * 
	 * Use named queries wisely, keep it at a single place for easy debugging. Use
	 * them for commonly used queries only. For entity specific query, you can keep
	 * them in the entity bean itself.
	 * 
	 * For web applications, always try to use JNDI DataSource rather than
	 * configuring to create connection in hibernate.
	 * 
	 * Avoid Many-to-Many relationships, it can be easily implemented using
	 * bidirectional One-to-Many and Many-to-One relationships.
	 * 
	 * For collections, try to use Lists, maps and sets. Avoid array because you
	 * don’t get benefit of lazy loading.
	 * 
	 * Do not treat exceptions as recoverable, roll back the Transaction and close
	 * the Session. If you do not do this, Hibernate cannot guarantee that in-memory
	 * state accurately represents the persistent state.
	 * 
	 * Prefer DAO pattern for exposing the different methods that can be used with
	 * entity bean
	 * 
	 * Prefer lazy fetching for associations
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection // to treat the below as list of objects
	private Set<Address> listOfAddresses = new HashSet<>();// hibernate automatically creates another table to insert
															// this list

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
	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	/**
	 * @param listOfAddresses
	 *            the listOfAddresses to set
	 */
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
}
