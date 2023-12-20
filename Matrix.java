package FullStack;

import java.util.Scanner;

public class Matrix {

	static public void main(String args[]) {
		
		int x[][] = new int[4][3];
		
		int y[][] = new int[3][4];
		
		int z[][] = new int[3][4];
		
		int a,b;
		Scanner matrixIp = new Scanner(System.in);
		
		//value of matrix X
		
		System.out.println("Enter the values of Matrix for X : ");
		
		for(a=0; a < x.length;a++) {
			for(b=0;b <x[a].length;b++) {
				x[a][b]= matrixIp.nextInt();
			}
			
		}
		//value of y matrix
		
		System.out.println("Enter the values of Matrix of Y : ");
		
		for(a=0; a < y.length;a++) {
			for(b=0;b <y[a].length;b++) {
				y[a][b]= matrixIp.nextInt();
			}
			
		}
		
		System.out.println("The Adiitional values of Matrix of X and Y : ");
		
		for(a=0; a < z.length;a++) {
			for(b=0;b <z[a].length;b++) {
				z[a][b]= x[a][b]*y[a][b];
				System.out.print(z[a][b]+" ");
			}
			System.out.println();	
		}

	
		
	}
}
