package FullStack;

import java.util.Scanner;

public class Ifstatement {
	
	public static void main(String args[]) {
		Scanner  d = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = d.nextInt();
		if(age >=18 ) {
		System.out.println("you are eligible"); 
		}
		else {
			System.out.println("you are not eligible");
		}
	}
}
