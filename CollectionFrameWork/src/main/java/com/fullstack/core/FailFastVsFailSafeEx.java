package com.fullstack.core;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafeEx {
	
	public static void main(String[] args) {
		
List <String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Deva");
		
		list.add("Devi");
		
		list.add("Devaa");
		
		list.add("Dev");
		
		list.add("Deva");
				
		list.add("Devayani");
		
		list.add("Nani");
		
		
		for(String name: list) {
			
			list.add("Harii");  //FailFast Iterator
			
			System.out.println(name);
		}
	}

}
