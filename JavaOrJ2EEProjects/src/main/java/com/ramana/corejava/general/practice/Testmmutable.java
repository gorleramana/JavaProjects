/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.Date;

/**
 * @author RamanaGorle
 *
 */
public class Testmmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CustomImmutable is my immutable class, am going to test here. 
		CustomImmutable c = new CustomImmutable("Ramana", "9333", new Date());
		//here you can only create another immutable contacts object but you can't modify the above one
		System.out.println(c.getMobile()+" "+c.getName()+" "+c.getRemindingDate());
	}

}

