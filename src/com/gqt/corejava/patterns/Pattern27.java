package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern27 {

	 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size:");
			int n =sc.nextInt();
			int rows =n;
			for(int i=1; i<=rows; i++) {
			for(int space = 1; space <= rows-i; space++)
			{ 
				System.out.print(" ");
			}
		    for (int j=1; j <= (2 * i - 1); j++) {
		    	System.out.print(j + "   ");
		   
		    }
		    System.out.println();
		    
		    	
		    }
		}
		
		
}


