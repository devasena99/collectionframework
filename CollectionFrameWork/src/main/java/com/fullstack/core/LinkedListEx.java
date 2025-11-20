package com.fullstack.core;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
List <String> list = new LinkedList<String>();
		
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
