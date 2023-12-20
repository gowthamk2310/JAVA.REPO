package FullStack;

public class String1az {
	public static void main(String args[]) {
		String alpha ="abcdefghijklmnopqrstuvwxyz";
		String beta ="zyxwvutrsponmlkjihgfedcba";
		String gama ="abd";
		
		System.out.println("the string :"+alpha.isEmpty());
		
		System.out.println("the string :"+alpha.isBlank());
		
		System.out.println("the string :"+gama.replace("abd","faf"));

		System.out.println("the string :"+beta.replace("zyx","srudrashgokul"));

		System.out.println("the string :"+alpha.isBlank());

	

	
	
	StringBuffer str = new StringBuffer("Welcome to Sunday samaiyal");
	
	System.out.println("the string :"+str.append(" one potato"));
	
	  StringBuffer sb = new StringBuffer("boomer ");
      sb.insert(3, "rohith");
     
      System.out.println(sb);
	
      StringBuffer rb = new StringBuffer("Clown jenin");
      rb.replace(1,5,"sympathy");
      System.out.println(rb);
      
      StringBuffer ab = new StringBuffer("Adarsruthih");
      ab.delete(5, 10);
      System.out.println(ab);
	
      StringBuffer vb = new StringBuffer("hsehtas");
      vb.reverse();
      System.out.println(vb);
      
}
}