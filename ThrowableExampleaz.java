package FullStack;

class customException extends Exception{
	public customException(String message) {
		super (message);
	}
}


public class ThrowableExampleaz {

	 public static void main(String args[]) {
		try {
			int age =-5;
			if (age<=0)
			{
				throw new customException("Nee innum porakavey ila da vendru");
				}
		System.out.println(age);	
		}catch(customException z) {
			System.out.println("nextvtym error ilama code podra"+z.getMessage());
		}
	}
	
}

