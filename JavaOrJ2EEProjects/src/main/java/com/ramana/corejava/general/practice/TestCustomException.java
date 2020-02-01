/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class TestCustomException {

	static void validate(int age) throws CustomException {
		if (age < 18)
			throw new CustomException("not valid");//THis is how you can generate your own message in exception
		else
			System.out.println("welcome to vote");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			validate(n);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);//THis message will not be printed. 
		}
		sc.close();
	}

}
