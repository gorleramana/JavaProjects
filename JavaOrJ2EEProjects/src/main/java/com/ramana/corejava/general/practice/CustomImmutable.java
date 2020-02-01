/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.Date;

/**
 * @author RamanaGorle
 *
 *         Immutable objects are by default thread safe, can be shared without
 *         synchronization in concurrent environment. 2) Immutable object
 *         simplifies development, because its easier to share between multiple
 *         threads without external synchronization.
 * 
 *         3) Immutable object boost performance of Java application by reducing
 *         synchronization in code.
 * 
 *         4) Another important benefit of Immutable objects is reusability, you
 *         can cache Immutable object and reuse them, much like String literals
 *         and Integers. You can use static factory methods to provide methods
 *         like valueOf(), which can return an existing Immutable object from
 *         cache, instead of creating a new one.
 * 
 *         immutable object has disadvantage of creating garbage as well. Since
 *         immutable object can not be reused and they are just a use and throw.
 *         String being a prime example, which can create lot of garbage and can
 *         potentially slow down application due to heavy garbage collection
 */
public final class CustomImmutable {

	private final String name;
	private final String mobile;

	/**
	 * Date is a mutable class, despite storing Date into final field it can be
	 * modified internally, so you need to make some changes in your immutable class
	 */
	private final Date remindingDate;

	public CustomImmutable(String name, String mobile, Date remindingDate) {
		this.name = name;
		this.mobile = mobile;

		if (remindingDate.getTime() < System.currentTimeMillis()) {
			throw new IllegalArgumentException("Can not set reminder” +“ for past time: " + remindingDate);
		}
		this.remindingDate = new Date(remindingDate.getTime());
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public Date getRemindingDate() {
		return (Date) remindingDate.clone();
	}
}