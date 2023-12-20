package FullStack;

import java.util.Scanner;

public class Monthstatement {
	static public void main(String args[]) {
		System.out.println("Enter the Month:");
	Scanner month = new Scanner(System.in);
	int a = month.nextInt();
	switch(a) {
	case 1:
		System.out.println("The Month is: Jan");
		break;
	case 2:
		System.out.println("The Month is: Feb");
		break;
	case 3:
		System.out.println("The Month is: March");
		break;
	case 4:
		System.out.println("The Month is: Apirl");
		break;
	case 5:
		System.out.println("The Month is: May");
		break;
	case 6:
		System.out.println("The Month is: June");
		break;
	case 7:
		System.out.println("The Month is: July");
		break;
	case 8:
		System.out.println("The Month is: Aug");
		break;
	case 9:
		System.out.println("The Month is: Sept");
		break;
	case 10:
		System.out.println("The Month is: Oct");
		break;
	case 11:
		System.out.println("The Month is: Nov");
		break;
	case 12:
		System.out.println("The Month is: Dec ");
		break;
	default:
		System.out.println("English calender ah padichutu vaa da vendru");
	}
	}
}
