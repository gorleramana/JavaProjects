package com.ramana.corejava.general.practice;
/**
 * 
 */

/**
 * @author RamanaGorle
 *
 */
public class HellWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("My First Program in Mac!!!");
		HellWorld h = new HellWorld(); 
		
		int c = h.cal(10, 20);
		
		System.out.println(c);
	}
	public int cal(int a, int b){
		return a+b;
	}

}
