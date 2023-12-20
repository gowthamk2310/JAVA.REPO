package FullStack;

import java.util.Scanner;

public class TriangleStatement {
	static public void main(String args[]) {
		
		System.out.println("Enter the int for pattern");
		Scanner object = new Scanner(System.in);
		int col = object.nextInt();
		for(int i=0;i<=col;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println("");
		}
		
	}
	}

 