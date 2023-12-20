package FullStack;

import java.util.Scanner;

public class Forstatement {
	public static void main(String args[]) {

	System.out.println("Enter the int for pattern");
	Scanner obj = new Scanner(System.in);
	int row = obj.nextInt();
	for(int i=row;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("#");
		}
		System.out.println("");
	}
	
	
	System.out.println("Enter the int for pattern");
	Scanner object = new Scanner(System.in);
	int col = object.nextInt();
	for(int i=0;i<=col;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("@");
		}
		System.out.println("");
	}
	
}
	}