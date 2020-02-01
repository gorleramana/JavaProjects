/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class TriangularNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TriangularNumber tn = new TriangularNumber();
		System.out.println("TN: "+tn.getTriangularNumber(6));
		System.out.println("FN: "+tn.getFactorialNumber(6));
	}
	
	public int getTriangularNumber(int number){
		System.out.println("Method "+number);
		if(number == 1){
			System.out.println("Returned 1");
			return 1;
		} else {
			int result = number + getTriangularNumber(number-1);
			System.out.print("Returned: "+result);
			System.out.println(" : "+number+" + get("+number+"-1)");
			return result;
		}
	}
	public int getFactorialNumber(int number){
		System.out.println("Method "+number);
		if(number == 1){
			System.out.println("Returned 1");
			return 1;
		} else {
			int result = number * getFactorialNumber(number-1);
			System.out.print("Returned: "+result);
			System.out.println(" : "+number+" * get("+number+"-1)");
			return result;
		}
	}

}
