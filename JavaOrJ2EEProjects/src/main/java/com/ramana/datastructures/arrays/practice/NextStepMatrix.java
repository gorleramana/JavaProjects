/**
 * 
 */
package com.ramana.datastructures.arrays.practice;

/**
 * @author RamanaGorle
 *
 */
public class NextStepMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String arr[][] = new String[12][4];
		String arr[][] =   {{"Med D", "70", " ", "Create Case"}, 
							{"Med D", "75", " ", "Create Case"},
							{"Med D", "76", " ", "Create Case"},
							{"Med D", "A3", " ", "Create Case"},
							{"Med D", "A4", " ", "Create Case"},
							{"Med D", "A5", " ", "Create Case"},
							{"Med D", "A6", " ", "Create Case"},
							{"Med D", "88", " ", "Create Case"},
							{"     ", "88", "DUR", "Review Susequent Claim"},
							{"     ", "88", " ", "Create Case"},
							{"     ", "79", " ", "Review Subsequent Claim"},
							{"     ", "BB", " ", "Fax"},
							{"Medicaid", "70, 75, 76", " ", "Fax"},
							};
		print2DArray(arr);
		String codes[] = {"88", "DUR", "A4"};
		String next = findNextStep(arr, codes);
		System.out.println(next+" is your next step");
	}

	private static String findNextStep(String[][] arr, String[] codes) {
		String nextStep = null;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				String subarr[] = arr[i];
				for(int k=0;k<codes.length;k++){
					if(codes[k].equals(subarr[1])){
						nextStep = subarr[3];
					}
				}
				break;
			}
		}
		return nextStep;		
	}
	private static void print2DArray(String[][] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				String subarr[] = arr[i];
				for(int k=0;k<subarr.length;k++){
					System.out.print(subarr[k]+" ");
				}
				System.out.println();
				break;
			}
		}
	}

}
