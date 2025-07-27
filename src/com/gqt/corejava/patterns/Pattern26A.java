package com.gqt.corejava.patterns;


		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class Pattern26A {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of rows:");
		        int rows = sc.nextInt();
		        sc.close(); // Close the scanner

		        for (int i = 1; i <= rows; i++) {
		            // Print leading spaces
		            for (int space = 1; space <= rows - i; space++) {
		                System.out.print("  ");
		            }

		            // Print increasing numbers from 1 to i
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }

		            // Print decreasing numbers from i-1 to 1
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j + " ");
		            }

		            // Move to next line
		            System.out.println();
		        }
		    }
		

	}


