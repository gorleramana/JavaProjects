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
public class Rotate2DArray90Degrees {

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
		rotateMatrix90(r, c, matrix);
		sc.close();
	}

	/**
	 * Brute force logic 
	 * 
	 * @param sc
	 * @param r
	 * @param c
	 */
	private static void rotateMatrix90(int r, int c, int[][] matrix) {
		
		int[][] rotatedMatrix = new int[c][r];
		for (int i = 0, l=r-1; i < r; i++, l--) {
			for (int j = 0, m=0; j < c; j++, m++) {
				rotatedMatrix[j][i] = matrix[l][m];
			}
		}
		System.out.println("Display your 90 degrees rotated matrix here: ");
		for(int l=0;l<c;l++){
			for(int m=0;m<r;m++){
				System.out.print(rotatedMatrix[l][m]+" ");
			}
			System.out.println();
		}
	}
}
