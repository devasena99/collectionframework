package com.fullstack.core;


import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
	
	public static void main(String[] args) {
		
		
Hashtable<String, String> ht = new Hashtable<String, String>();
		
        ht.put("ID", "121");
		
		ht.put("Name", "Deva");
		
		ht.put("Salary", "96000.45");
		
		ht.put("Address", "Pune, India");
		
		for(Map.Entry<String, String> m: ht.entrySet()) {
			
			System.out.println(m.getKey()+":"+m.getValue());
	}
  }
}
