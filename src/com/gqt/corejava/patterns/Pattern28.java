package com.gqt.corejava.patterns;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
        
	    for (int i = 1; i <= n; i++) {
			            
			 for (int space = 1; space <= n - i; space++) {
			      System.out.print(" ");
			  }
	          for (int j = 1; j <= 2 * i - 1; j++) {
			       if (j == 1 || j == 2 * i - 1) {
			            System.out.print(i);
			          } else {
			                  System.out.print(" ");
			                }
			            }

			            System.out.println();
			        }

			        // Lower half
			        for (int i = n - 1; i >= 1; i--) {
			            
			            for (int space = 1; space <= n - i; space++) {
			                System.out.print(" ");
			            }

			            
			            for (int j = 1; j <= 2 * i - 1; j++) {
			                if (j == 1 || j == 2 * i - 1) {
			                    System.out.print(i);
			                } else {
			                    System.out.print(" ");
			                }
			            }

			            System.out.println();
			        }
	}

}
