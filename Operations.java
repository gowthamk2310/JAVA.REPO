package FullStack;

import java.util.Scanner;

public class Operations {
	public static void main(String args[]) {
	Scanner c = new Scanner(System.in);
	System.out.println("Enter the Numbers");
	int num1 = c.nextInt();
	int num2 = c.nextInt();
	System.out.println("Addition:"+ (num1+num2));
	System.out.println("Subtraction:"+ (num1-num2));
	System.out.println("Multiplication:"+ (num1*num2));
	System.out.println("Division:"+ (num1/num2));
	System.out.println("Reminder:"+ (num1%num2));
	}
}
