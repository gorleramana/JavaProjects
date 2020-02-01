/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class BigIntegerTest {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      BigInteger n = in.nextBigInteger();
	      in.close();
	      // Write your code here.
	       BigInteger m = n;
	       int divisors = 0;
	       BigInteger one = BigInteger.valueOf(1);
	       while(m.longValue() >0){
	            if(n.remainder(m) == BigInteger.ZERO){
	                divisors++;
	            }
	           m.subtract(one);
	       }
	       if(divisors > 2) {
	           System.out.println("not prime");
	       } else {
	           System.out.println("prime");
	       }
	   }
}
