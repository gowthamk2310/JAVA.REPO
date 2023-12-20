package FullStack.Taskstatement;

public class RightLefttriangle {

	public static void main(String args[]) {
	 int row =5,i,j,a,b;
	 
	 for(i=1;i<=row;i++) {
		 for(j=1;j <=i;j++) {
			 System.out.print("# ");
		 }
	 System.out.println("");
	 }
	      
		for (a=0; a<row; a++){  
		  
			for (b=2*(row-a); b>=0; b--){  
		 
			System.out.print(" ");   
		}   
		 
			for (b=0; b<=a; b++ ){   
		   
			System.out.print("# ");   
		}    
			System.out.println(); 
			}  
	 
	
	}
	
}
