package FullStack.Taskstatement;

import java.util.Scanner;

public class Palindromestatement {
	
		public static void main(String[] args) {
		    Scanner gh = new Scanner(System.in);
		    int n = gh.nextInt();
		    int rev = 0, remainder;
		    
	
		    int originaln = n;
		    
		   
		    while (n != 0) {
		      remainder = n % 10;
		      rev = rev * 10 + remainder;
		      n /= 10;
		    }
		    

		    if (originaln == rev) {
		      System.out.println(originaln + " is Palindrome.");
		    }
		    else {
		      System.out.println(originaln + " is not Palindrome.");
		    }
		  }
		
	}
	  


