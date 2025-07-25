package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Scanner1 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		byte b = sc.nextByte();
		System.out.println("Byte data ="+b);
		System.out.println("------");
		System.out.println("Enter the short data:");
		short s = sc.nextShort();
		System.out.println("short data ="+s);
		System.out.println("------");
        System.out.println("Enter the int data:");
		int i  = sc.nextInt();
		System.out.println("Int data ="+i);
		System.out.println("------");
		System.out.println("Enter the long data:");
		long l = sc.nextLong();
		System.out.println("Long data ="+l);
		System.out.println("------");
		System.out.println("Enter the float data:");
		float f= sc.nextFloat();
		System.out.println("Float data ="+f);
		System.out.println("------");
        System.out.println("Enter double data:");
		double d = sc.nextDouble();
		System.out.println("Double data ="+b);
		System.out.println("------");
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("String data ="+str);
		sc.close();
	}
}
		
		
		

	





	
