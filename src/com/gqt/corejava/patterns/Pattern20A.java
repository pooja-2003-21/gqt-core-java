package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern20A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		sc.close();  // good practice

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("_ ");
			}
			for(int k = 1; k <= n; k++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
	}
}
