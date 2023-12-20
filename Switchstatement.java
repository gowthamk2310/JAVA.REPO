package FullStack;

import java.util.Scanner;

public class Switchstatement {
	static public void main(String args[]) {
		System.out.println("Enter the Day:");
	Scanner days = new Scanner(System.in);
	String a = days.next();
	switch(a) {
	case "monday":
	System.out.println("First Day of Working Day");
	break;
	case "tuesday":
	System.out.println("Second Day of Working Day");
	break;
	case "wednesday":
	System.out.println("Third Day of Working Day");
	break;
	case "thursday":
	System.out.println("Fourth Day of Working Day");
	break;
	case "friday":
	System.out.println("Fifth Day of Working Day");
	break;
	case "saturday":
	System.out.println("Holiday");
	case "sunday":
	System.out.println("HoliDay");
	break;
	}
	
}
}