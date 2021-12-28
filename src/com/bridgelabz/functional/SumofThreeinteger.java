package com.bridgelabz.functional;

import java.util.Scanner;

public class SumofThreeinteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int number = scanner.nextInt();
		int tripletCount = 0;

		int[] arrayStore = new int[number];
		System.out.println("Enter the Elements ");
		for (int i = 0; i < number; i++) {
			System.out.print("Enter element " + i + ":");
			arrayStore[i] = scanner.nextInt();
		}

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				for (int k = 0; k < number; k++) {

					if (arrayStore[i] + arrayStore[j] + arrayStore[k] == 0) {
						tripletCount++;
						System.out.println("distinct triplets are:" + arrayStore[i] + " , " + arrayStore[j] + " , "
								+ arrayStore[k] + " are 3 triplets that sums to ZERO");
					}
				}
			}
		}

		System.out.println("Number of  Distinct triplets present in the Array = " + tripletCount);
	}

}
