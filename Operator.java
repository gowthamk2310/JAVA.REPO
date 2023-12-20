package FullStack;

import java.util.Scanner;

public class Operator {

	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int num1 = c.nextInt();
		int num2 = c.nextInt();
		System.out.println("equal :"+ (num1 == num2));
		System.out.println("not equal: "+ (num1 != num2));
		System.out.println("greater than: "+ (num1 > num2));
		System.out.println("lesser than: "+ (num1 < num2));
		System.out.println("greater tha or equal to: "+ (num1 >= num2));
		System.out.println("leeser than or equal to: "+ (num1 <= num2));
			
}
}