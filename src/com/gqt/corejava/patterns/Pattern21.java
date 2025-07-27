package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		sc.close(); // Close scanner to prevent resource leak

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("_ ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
