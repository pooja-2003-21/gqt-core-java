package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Patt1 {


		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                // Print '*' if it's the first or last row, or first/last column
		                if (i == 1 || i == n || j == 1 || j == n) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  "); // Two spaces for alignment
		                }
		            }
		            System.out.println();
		        }

		        sc.close(); // ✅ Close the Scanner
		    }
		}


	


