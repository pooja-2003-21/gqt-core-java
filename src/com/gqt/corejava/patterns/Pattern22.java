package com.gqt.corejava.patterns;
import java.util.Scanner;
 class Pattern26 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n =sc.nextInt();
		int count;
		for(int i=1; i<=n; i++) {
			count=1;
	    for (int j=1; j<=n; j++) {
	    	System.out.print(count+" ");
	    	count =1-count;
	    }
	    System.out.println();
	    
	    	
	    }
		}
	}
	
