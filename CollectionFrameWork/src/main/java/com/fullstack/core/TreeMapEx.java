package com.fullstack.core;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
Map<String, String> map = new TreeMap<String, String>();
		
		map.put("ID", "121");
		
		map.put("Name", "Deva");
		
		map.put("Salary", "96000.45");
		
		map.put("Address", "Pune, India");
		
		/*
		 * for(Map.Entry<String, String> m: map.entrySet()) {
		 * 
		 * System.out.println(m.getKey()+":"+m.getValue()); //does not maintain the
		 * order }
		 */
		
		map.forEach((k, v) -> {
			System.out.println(k+":"+v);  //Alphanumeric order
		});
	}

}
