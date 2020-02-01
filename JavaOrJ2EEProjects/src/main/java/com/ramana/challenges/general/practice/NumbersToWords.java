/**
 * Class created: Nov 19, 2019. 
 */
package com.ramana.challenges.general.practice;

/**
 * This method will contain the logic to convert the numbers to words
 * 
 * @author RamanaGorle
 *
 */
public class NumbersToWords {

	private String[] specialNames = { "", " thousand", " million" };

	private String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy",
			" eighty", " ninety" };

	private String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine",
			" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
			" nineteen" };

	/**
	 * This method will convert the numbers that are less than 1000 to words
	 * 
	 * @param number
	 * @return string
	 */
	private String convertLessThanOneThousand(int number) {
		String current;

		if (number % 100 < 20) {
			current = numNames[number % 100];
			number /= 100;
		} else {
			current = numNames[number % 10];
			number /= 10;

			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return numNames[number] + " hundred" + current;
	}

	/**
	 * This method will convert the numbers that are bigger than 1000 to words
	 * 
	 * @param number
	 * @return string
	 * @throws NumberGreaterThanMaximum
	 */
	public String convert(int number) throws NumberGreaterThanMaximum {

		if (number == 0) {
			return "zero";
		}
		if (number > 999999999)
			throw new NumberGreaterThanMaximum("Number is Greater than 999,999,999.");

		String prefix = "";

		if (number < 0) {
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

	public static void main(String args[]) throws NumberGreaterThanMaximum {
		NumbersToWords ntw = new NumbersToWords();
		System.out.println(ntw.convert(0));
		System.out.println(ntw.convert(7));
		System.out.println(ntw.convert(15));
		System.out.println(ntw.convert(99));
		System.out.println(ntw.convert(234));
		System.out.println(ntw.convert(1000000));
		System.out.println(ntw.convert(999999999));
		//ntw.convert(1000000000);
		System.out.println(ntw.convert(-1234));
	}
}
