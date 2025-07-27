package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		sc.close(); // Close the scanner

		for (int i = 1; i <= n; i++) {

			// Print spaces
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}

			// Print numbers from 1 to (2*i - 1)
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
