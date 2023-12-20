package FullStack;

import java.util.Scanner;

public class EsleIfstatment {
	
	static public void main(String args[]) {
	Scanner fn = new Scanner(System.in);
	System.out.println("Enter your marks: ");
	int mark = fn.nextInt();
	if(mark >= 90 && mark <=100) {
		System.out.println("Your grade is A+");
	}
	else if(mark >= 80 && mark <= 89) {
		System.out.println("Your grade is A");
	}
	else if(mark >= 70 && mark <= 79) {
		System.out.println("Your grade is B+");
	}
	else if(mark >= 60 && mark <= 69) {
		System.out.println("Your grade is B");
	}
	else if(mark >= 50 && mark <= 59) {
		System.out.println("Your grade is C+");
	}
	else if(mark >= 40 && mark <= 49) {
		System.out.println("Your grade is c");
	}
	else {
		System.out.println("Re-appear");
}
	}
}
