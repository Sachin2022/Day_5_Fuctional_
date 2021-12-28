package com.bridgelabz.functional;

import java.util.Scanner;

public class Arrayof2D {

	public static void main(String[] args) {
		System.out.println("Creating the Two Dimensional Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = sc.nextInt();
		System.out.println("Enter the number of colums");
		int n = sc.nextInt();
		sc.close();
		int array[][] = new int[m][n];
		int z = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = z;
				System.out.println("array[" + i + "][" + j + "]=" + array[i][j] + "");
				z++;
			}
			System.out.println();
		}

	}

}
