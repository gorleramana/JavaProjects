/**
 * 
 */
package org.javabrains.practice.hibernate.dto;

/**
 * @author RamanaGorle
 *
 */
public class RGRegisterDTO {
	private int registerId;
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private String email;
	private String username;
	private String password;
	private String confirmPassword;
	private boolean addressIndicator;
	private RGAddressDTO address;
	private RGForgotPasswordDTO forgotPassword;
	/**
	 * @return the registerId
	 */
	public int getRegisterId() {
		return registerId;
	}
	/**
	 * @param registerId the registerId to set
	 */
	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the addressIndicator
	 */
	public boolean isAddressIndicator() {
		return addressIndicator;
	}
	/**
	 * @param addressIndicator the addressIndicator to set
	 */
	public void setAddressIndicator(boolean addressIndicator) {
		this.addressIndicator = addressIndicator;
	}
	/**
	 * @return the address
	 */
	public RGAddressDTO getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(RGAddressDTO address) {
		this.address = address;
	}
	/**
	 * @return the forgotPassword
	 */
	public RGForgotPasswordDTO getForgotPassword() {
		return forgotPassword;
	}
	/**
	 * @param forgotPassword the forgotPassword to set
	 */
	public void setForgotPassword(RGForgotPasswordDTO forgotPassword) {
		this.forgotPassword = forgotPassword;
	}
}
