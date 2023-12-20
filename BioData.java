package FullStack;

import java.util.Scanner;

public class BioData {

	public static void main(String args[]) {
		Scanner b  = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = b.next();
		
		System.out.println("Enter your Age:");
		int age = b.nextInt();
		
		System.out.println("Enter you DoB");
		String dob = b.next();
		
		System.out.println("Enter your Phoneno:");
		long phno = b.nextLong();
		
		System.out.println("Enter your Qualification:");
		String qualification = b.next();
		
		System.out.println("Enter your Percentage:");
		float percentage = b.nextFloat();
		
		System.out.println("Enter your Address:");
		String doorno= b.next();
		String streetname = b.next();
		String city = b.next();
		String state = b.next();
		
		System.out.println("Welcome:"+name);
		System.out.println("Age: "+age);
		System.out.println("Date of Birth:"+dob);
		System.out.println("Phone no:"+phno);
		System.out.println("Qualifications:"+qualification);
		System.out.println("Percenatge:"+percentage);
		System.out.println("Door no:"+doorno);
		System.out.println("Street name:"+streetname);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		
		
	}
}
