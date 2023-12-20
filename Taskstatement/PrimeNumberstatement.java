package FullStack.Taskstatement;

public class PrimeNumberstatement {

	 {	
			int n= 10,i =0,num =0;
		       
		       String  primeNumbers = "";

		       for (i = 1; i <= n ; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     primeNumbers = primeNumbers + i+" ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 100 are : "+primeNumbers);
		   }
	
}
