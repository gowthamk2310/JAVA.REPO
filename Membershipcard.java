package FullStack;

import java.util.Scanner;

public class Membershipcard {

	static public void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your Age:");
		int age = obj.nextInt();
		
		if(age >= 18) {
			
			System.out.println("Enter Availability of card:");
			String membership = obj.next();
			
			if(membership.equals("yes")){
				System.out.println("You are eligibile for 10% Discount ");
			}
			else if(membership.equals("no")){
				System.out.println("You are eligible for 5% Discount ");
			}
			else {
				System.out.println("Invalid Membership ");
			}
		}
		else {
		System.out.println("Your are under 18");
		}
	}

	
}
