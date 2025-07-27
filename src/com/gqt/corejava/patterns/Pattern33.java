package com.gqt.corejava.patterns;

public class Pattern33 {

    public static void main(String[] args) {
        int n = 5; 
        char startChar;

        for (int i = 1; i <= n; i++) {
            
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Calculate the starting character (e.g., E, C, A, ...)
            startChar = (char) ('A' + (2 * (i - 1)));

            // Print characters in decreasing order from startChar to 'A'
            for (char ch = startChar; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
