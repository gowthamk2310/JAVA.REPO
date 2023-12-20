package FullStack.Taskstatement;

import java.util.Scanner;

public class Factorialstatement {
	static public void main(String args[]) {
		 
	 System.out.println("The factorial Nuumbers ");
	 Scanner fn = new Scanner(System.in);
	 int no = fn.nextInt();
	 int i = 1;
	 long factorial = 1;
	 
	 while(i <= no)
     {
         factorial *= i;
         i++;
     }
	 System.out.printf("Factorial of "+no+" = "+factorial);	 
}
}