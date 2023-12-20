package FullStack.Taskstatement;

import java.util.Scanner;

public class Fibonaccistatement {
 
	static public void main(String args[]) {
		Scanner fib = new Scanner(System.in);
		
		System.out.println("Enter the range for fibonacci series: ");
		int n = fib.nextInt();
		
		System.out.println("Enter the numbers for fibonacci series: ");
		int one = fib.nextInt();
		int two = fib.nextInt();
		
		for(int i =1; i <=n ; ++i) {
			System.out.println(one+",");
			
			int three = one +  two;
			one = two;
			two = three;
			
		}
	}
}
