package FullStack;

public class Arrayaz {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4};
		String str = "Simbu";
		
		
		try {
			arr [4] = 4;
			str.charAt(9);
			
		}
		catch(ArrayIndexOutOfBoundsException eo) {
			System.out.println("Error oda code podatha parama "+eo);
		}
		
		System.out.println("After Exceptions : ila varathu nee thapa thnada code ey poturuka ");
	}
	
}
