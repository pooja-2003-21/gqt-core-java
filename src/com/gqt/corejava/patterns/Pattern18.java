package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n =sc.nextInt();
	   int count = n*n;
	   for(int i=1; i<=n; i++) {
	   for(int j=1; j<=i; j++) {
		   {
			   System.out.print("*");
			   count++;
			   
		   }
		   
	   }
	   	   
	   }

	}

}

