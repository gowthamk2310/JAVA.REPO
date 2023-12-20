package FullStack;

import java.util.HashMap;
import java.util.Map;

public class Mapaz {
	public static void main(String args[])
	{
	
	Map<String,Integer> myObj = new HashMap();
	Map<String,Integer> my = new HashMap<>();
	
	my.put("Raghupal", 9);
	my.put("nova ", 99);
	myObj.put("jenin", 25);
	myObj.put("vicky", 1);
	myObj.put("makatta", 20);
	System.out.println(myObj);
	System.out.println(my);
	
	
	
	System.out.println(my.remove("nova"));
	System.out.println(my);
	
	System.out.println(myObj.get("makatta"));
	
	System.out.println(myObj.remove("vicky"));
	
	System.out.println(myObj);
	
	
	
	
	
	

}
}