package com.gqt.corejava.patterns;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

	}

}
