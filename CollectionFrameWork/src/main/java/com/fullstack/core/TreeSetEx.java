package com.fullstack.core;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		
     Set <String> set = new TreeSet<String>();
		
		set.add("Deva");
		
		set.add("Devi");
		
		set.add("Devaa");
		
		set.add("Dev");
		
		set.add("Deva");
				
		set.add("Devayani");
		
		set.add("Nani");
		
	//	set.add(null); //null pointer Exception(does not allows null element)
		
		
		set.forEach(System.out::println);
	}

}
