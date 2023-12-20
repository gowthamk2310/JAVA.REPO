package FullStack;

import java.util.Scanner;

public class Swappingstatement {
	public static void main(String args[]) {
		Scanner twoNumbers = new Scanner(System.in);
		int a = twoNumbers.nextInt();
		int b = twoNumbers.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Entered numbers are: ");
		System.out.println("Value of A:"+a);
		System.out.println("Value of B:"+b);
		
	}
}
