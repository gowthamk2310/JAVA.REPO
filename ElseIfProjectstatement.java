package FullStack;

import java.util.Scanner;

public class ElseIfProjectstatement {
	static public void main(String args[]) {
		Scanner gn = new Scanner(System.in);
		System.out.println("You are going help a monkey to cross the river while the crocdile fell sleep.the crocdile will sleep in morning and evening,you should give instruction to tne monkey to cross the river while the crocdile fells sleep.");

		System.out.println("Monkey's time to escape River");
		int time = gn.nextInt();
		if(( time >= 14 && time <= 18)||( time >= 18 &&  time <= 22)){
			System.out.println("The crocdile is awake,So Monkey can't escape ");
		}
		else if(( time >= 11 &&  time < 14)|| (time >= 6 &&  time < 9)) {
			System.out.println("It is the right time to  cross the river while the crocdile is sleeping");
		}
		else {
			System.out.println("Monkey will not escape");
	    }
	} 
}
