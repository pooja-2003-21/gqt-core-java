package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		sc.close(); // good practice

		int count;
		for (int i = 1; i <= n; i++) {
			count = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(count + "  ");
				count = 1 - count; // toggles between 1 and 0
			}
			System.out.println();
		}
	}
}    