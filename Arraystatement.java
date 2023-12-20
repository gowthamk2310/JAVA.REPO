package FullStack;

public class Arraystatement {
	static public void main(String args[]) {
	int[] myArray =	{1,12,3,14,5,16,7,18};
	System.out.println(myArray.length);
	
	System.out.println();
	
	String[] adarsh= {"Sruthi","Sneha","Mubina","Swetha","Swathi","thenmadhura"};
	System.out.println("The Length of adarsh is:"+adarsh.length+" "+adarsh[2]);
	
	System.out.println();
	
	String[] adarshGokul = {"Sruthi","Sneha","Mubina","Swetha","Swathi","thenmadhura"};
	adarshGokul[4]="Rahul";
	System.out.println("suss"+adarshGokul[4]);
	
	System.out.println();
	
	for(String j: adarshGokul) {
		System.out.println(j);
		
	}
	}
}
