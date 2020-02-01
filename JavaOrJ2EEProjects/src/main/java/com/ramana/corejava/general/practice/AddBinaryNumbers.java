package com.ramana.corejava.general.practice;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class AddBinaryNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input: ");
		String b = sc.next();
		String c = sc.next();
		
		System.out.println("Addition above two binary numbers: "+Integer.toBinaryString(Integer.parseInt(b, 2)+Integer.parseInt(c, 2)));
		sc.close();
	}
}