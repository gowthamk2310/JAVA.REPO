package FullStack;

import java. util.Scanner;

public class NestedIfstatement {
	static public void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your Age:");
		int age = in.nextInt();
		System.out.println("Enter your Weight:");
		var weight = in.nextInt();
		
		if(age >= 18) {
			if(weight >=45) {
				System.out.println("Your eligibile for Blood Donation ");
			}
			else {
				System.out.println("Your not eligible ");
			}
		}
		else {
		System.out.println("Your are under 18");
		}
	}

}
