package com.gqt.corejava.patterns;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

	}

}
