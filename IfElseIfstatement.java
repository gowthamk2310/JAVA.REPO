package FullStack;

import java.util.Scanner;

public class IfElseIfstatement {
	
	static public void main(String args[]) {
		Scanner es = new Scanner(System.in);
		System.out.println("Enter your unit used:");
		int unit = es.nextInt();
		System.out.println("Enter your Amount:");
		int bill = es. nextInt();
		int currentbill = unit*bill;
		if( currentbill >= 300) {
				System.out.println("Your current bill is :"+currentbill);
		}
		else {
			System.out.println("Current is Free");
		}
	
	}

}
