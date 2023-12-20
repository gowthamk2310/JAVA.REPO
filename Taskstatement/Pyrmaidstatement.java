package FullStack.Taskstatement;

public class Pyrmaidstatement {

	 static public void main(String args[]) {
	int row =5,i,j,k;
	
	System.out.println("pyrmaid triangle");
	System.out.println();
	
	
	for(i =1 ; i <= row ; i++)
	{
		for(j =row; j>=i;j--) 
		{
			System.out.print(" ");
		}
		for(k =2; k <=i+1;k++) {
			System.out.print("# ");
		}
	System.out.println();
	}
	
	//right angle
	System.out.println();
	System.out.println("Right angle triangle");
	System.out.println();
	
	for(i =1 ; i <= row ; i++)
	{
		
		for(k =2; k <=i+1;k++) 
		{
			System.out.print("#");
		}
		
		
		for(j =row; j>=i;j--) 
		{
			System.out.print(" ");
		}
		
	System.out.println();
	}
	// left angle
	System.out.println();
	System.out.println("Left angle triangle");
	System.out.println();
	 
	for(i =1 ; i <= row ; i++)
	{
		for(j =row; j>=i;j--) 
		{
			System.out.print(" ");
		}
		for(k =2; k <=i+1;k++) {
			System.out.print("#");
		}
	System.out.println();
	}
	//inverted right triangle
	
	System.out.println();
	System.out.println("inverted right angle triangle");
	System.out.println();
	 
	for(i =1 ; i <= row ; i++)
	{
		
		for(k =2; k <=i+1;k++)
		{
			System.out.print(" ");
		}
		
		for(j =row; j>=i;j--) 
		{
			System.out.print("#");
		}
		
	System.out.println();
	}

	//inverted left triangle
	System.out.println();
	System.out.println("inverted left angle triangle");
	System.out.println();
	
	for(i =1 ; i <= row ; i++)
	{
		for(j =row; j>=i;j--) 
		{
			System.out.print("#");
		}

		for(k =2; k <=i+1;k++) 
		{
			System.out.print(" ");
		}
		
				
	System.out.println();
	}

	// reverse
	
	System.out.println("pyrmaid triangle");
	System.out.println();
	
	
	for(i =1 ; i <= row ; i++)
	{
		
		for(k =2; k <=i+1;k++) {
			System.out.print(" ");
		}
		
		for(j =row; j>=i;j--) 
		{
			System.out.print("# ");
		}
		
	System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 }
}