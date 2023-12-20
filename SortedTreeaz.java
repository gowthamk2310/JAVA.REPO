package FullStack;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedTreeaz {

	static public void main(String args[]) {
		SortedMap<String,Integer> sortMap = new TreeMap<>();
		sortMap.put("msd",7);
		sortMap.put("raina",3);
		sortMap.put("kohli",18);
		sortMap.put("mc",42);
		sortMap.put("kane",22);
		sortMap.put("stokes",55);
		sortMap.put("conway",47);
		sortMap.put("shiva",45);
		sortMap.put("gill",10);
		
		
		System.out.println(sortMap);
		System.out.println();
		
		for(Map.Entry<String, Integer> entry : sortMap.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
			
		}
		
		
		
		
	}
	
	
}
