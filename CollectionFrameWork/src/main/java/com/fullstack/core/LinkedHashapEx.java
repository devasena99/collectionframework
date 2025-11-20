package com.fullstack.core;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashapEx {
	
	public static void main(String[] args) {
		
		 Map <String, String> map = new LinkedHashMap<String, String>();
			
	        map.put("ID", "121");
			
			map.put("Name", "Deva");
			
			map.put("Salary", "96000.45");
			
			map.put("Address", "Pune, India");
			
			map.forEach((k,v) ->{
				System.out.println(k+":"+v);
			});
	}

}
