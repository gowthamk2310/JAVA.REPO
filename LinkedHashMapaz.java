package FullStack;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapaz {

	public static void main(String args[]) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Apple", 11);
		map.put("GreenApple", 21);
		map.put("Orange", 31);
		map.put("BlueBerry", 41);
		map.put("Grape", 51);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
}
