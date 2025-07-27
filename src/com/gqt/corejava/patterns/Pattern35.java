package com.gqt.corejava.patterns;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

        for (int i = 0; i < n; i++) {
           
            for (int s = 1; s <= n - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
	}

}
