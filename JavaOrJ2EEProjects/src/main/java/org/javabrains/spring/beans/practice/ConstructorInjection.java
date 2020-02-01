/**
 * 
 */
package org.javabrains.spring.beans.practice;

/**
 * @author RamanaGorle
 *
 *         1.The fundamental difference between setter and constructor
 *         injection, as their name implies is How dependency is injected
 * 
 *         2. Because of using setter method, setter Injection in more readable
 *         than constructor injection in Spring configuration file usually
 *         applicationContext.xml.While in constructor injection, since it uses
 *         an index to inject the dependency, it's not as readable as setter
 *         injection and you need to refer either Java documentation or code to
 *         find which index corresponds to which property
 * 
 *         3. Another difference between setter vs constructor injection in
 *         Spring and one of the drawback of setter injection is that it does
 *         not ensures dependency Injection. You can not guarantee that certain
 *         dependency is injected or not, which means you may have an object
 *         with incomplete dependency. On other hand constructor Injection does
 *         not allow you to construct object, until your dependencies are ready
 * 
 *         4. One more drawback of setter Injection is Security. By using setter
 *         injection, you can override certain dependency which is not possible
 *         with constructor injection because every time you call the
 *         constructor, a new object is gets created
 * 
 *         5. If Object A and B are dependent each other i.e A is depends ob B
 *         and vice-versa. Spring throws ObjectCurrentlyInCreationException
 *         while creating objects of A and B bcz A object cannot be created
 *         until B is created and vice-versa. So spring can resolve circular
 *         dependencies through setter-injection. Objects constructed before
 *         setter methods invoked
 */
public class ConstructorInjection {
	private String type;
	private int width;

	/**
	 * Application Context is using the below constructors to set the value of of
	 * the type to property
	 * 
	 */
	public ConstructorInjection(String type) {
		this.type = type;
	}

	public ConstructorInjection(int a) {
		this.width = a;
	}

	public ConstructorInjection(String type, int a) {
		this.type = type;
		this.width = a;
	}

	public void draw() {
		System.out.println("Traingle drawn: " + getType() + " with " + getWidth());
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

}
