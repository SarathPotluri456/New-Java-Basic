package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	 private static final int MAX_ENTRIES = 2;

	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap(MAX_ENTRIES, 0.75F, false) {
			 protected boolean removeEldestEntry(Map.Entry eldest)
			 {
				 return size() > MAX_ENTRIES;
			 }
			
		};
		
		
		
		
		lm.put(2, "Sarath");
		lm.put(3, "jdxvj");
		lm.put(5, "Sarath");
		lm.put(6, "jdxvj");
		lm.put(7, "Sarath");
		lm.put(8, "jdxvj");
		System.out.println(lm);
		
	
		
		
		 
	}


	
	}

