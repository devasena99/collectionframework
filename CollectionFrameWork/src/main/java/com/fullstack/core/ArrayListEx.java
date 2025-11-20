package com.fullstack.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		  
		List <String> list = new ArrayList<String>();
		
		list.add("Deva");
		
		list.add("Devi");
		
		list.add("Devaa");
		
		list.add("Dev");
		
		list.add("Deva");
				
		list.add("Devayani");
		
		list.add("Nani");
		
	//	System.out.println(list);
		
	/*
	 * Iterator<String> iterator = list.iterator();
	 * 
	 * while (iterator.hasNext()) { String string = (String) iterator.next();
	 * 
	 * System.out.println(string);
	 * 
	 * }
	 */
		
		
		for(String name: list) {
			
			System.out.println(name);
		}
		
	}

}
