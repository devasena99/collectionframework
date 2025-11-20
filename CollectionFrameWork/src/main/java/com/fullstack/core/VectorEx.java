package com.fullstack.core;

import java.util.LinkedList;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector <String> vector = new Vector<String>();
		
		vector.add("Deva");
		
		vector.add("Devi");
		
		vector.add("Devaa");
		
		vector.add("Dev");
		
		vector.add("Deva");
				
		vector.add("Devayani");
		
		vector.add("Nani");
		
		vector.forEach(System.out::println);
		
	
	}

}
