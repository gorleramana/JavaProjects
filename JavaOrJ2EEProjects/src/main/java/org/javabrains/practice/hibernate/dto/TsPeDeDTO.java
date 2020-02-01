/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author RamanaGorle
 *
 */
@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)//This is used to update and select the query first
public class TsPeDeDTO {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
