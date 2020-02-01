/**
 * 
 */
package com.ramana.datastructures.arrays.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 * 
 *facebook
 */
public class SetColumnRowToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and columns here: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter your matrix data here: ");
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		setColumnRowToZero(r, c, matrix);
		sc.close();
	}

	/**
	 * 
	 * @param r
	 * @param c
	 * @param matrix
	 */
	private static void setColumnRowToZero(int r, int c, int[][] matrix) {
		int[][] zeroMatrix = matrix;
		boolean breakTag = false;
		for (int l = 0; l < r; l++) {
			for (int m = 0; m < c; m++) {
				if (matrix[l][m] == 0) {
					int i = 0, j = 0;
					while (i < r) {
						zeroMatrix[i++][m] = 0;
					}
					while (j < c) {
						zeroMatrix[l][j++] = 0;
					}
					breakTag = true;
				}
				if (breakTag) {
					break;
				}
			}
			if (breakTag) {
				break;
			}
		}

		System.out.println("Display your new matrix here: ");
		for (int l = 0; l < r; l++) {
			for (int m = 0; m < c; m++) {
				System.out.print(zeroMatrix[l][m] + " ");
			}
			System.out.println();
		}
	}

}
