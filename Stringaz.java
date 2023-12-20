package FullStack;

public class Stringaz {
	public static void main(String args[]) {
	String alpha ="abcdefghijklmnopqrstuvwxyz";
	String beta ="zyxwvutrsponmlkjihgfedcba";
	String gama ="abd";
	
	System.out.println("the length of string :"+alpha.length());
	
	System.out.println("the string : "+alpha.toUpperCase());
	
	System.out.println("the string : "+alpha.toLowerCase());
	
	System.out.println("the string index : "+alpha.indexOf("n"));
	
	System.out.println("the string : "+alpha.endsWith("y"));
	
	System.out.println("the string : "+alpha.isEmpty());
	
	System.out.println("the string : "+alpha.substring(10,14));
	System.out.println("the string : "+alpha.charAt(22));
	
	String ww = "the world \"is\" nearing the end";
	System.out.println(ww);
	
	String ww1 = "the world is nearing the end";
	System.out.println(ww);
	
	
	System.out.println("the string : "+alpha.concat(beta));
	
	System.out.println("the string : "+alpha.compareTo(gama));
	
	System.out.println("the string : "+alpha.equalsIgnoreCase(beta));
	
	}
}
