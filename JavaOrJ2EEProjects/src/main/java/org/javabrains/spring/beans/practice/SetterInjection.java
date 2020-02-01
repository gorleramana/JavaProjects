/**
 * 
 */
package org.javabrains.spring.beans.practice;

/**
 * @author RamanaGorle
 *
 *         Any normal java class that is initialized by Spring IoC container is
 *         called Spring Bean. We use Spring ApplicationContext to get the
 *         Spring Bean instance.
 * 
 *         Spring IoC container manages the life cycle of Spring Bean, bean
 *         scopes and injecting any required dependencies in the bean.
 */
public class SetterInjection {
	private String type;

	public void draw() {
		System.out.println("Traingle drawn: " + getType());
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Application Context is using the below setter to set the value of of the type
	 * to property
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
