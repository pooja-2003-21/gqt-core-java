package com.gqt.corejava.patterns;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
	}

}
