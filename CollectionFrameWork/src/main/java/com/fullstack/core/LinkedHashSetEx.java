package com.fullstack.core;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		
Set <String> set = new LinkedHashSet<String>();
		
		set.add("Deva");
		
		set.add("Devi");
		
		set.add("Devaa");
		
		set.add("Dev");
		
		set.add("Deva");
				
		set.add("Devayani");
		
		set.add("Nani");
		
		set.add(null);
		
		
		set.forEach(System.out::println);
	}

}
