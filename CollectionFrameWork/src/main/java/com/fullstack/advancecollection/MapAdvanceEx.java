package com.fullstack.advancecollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAdvanceEx {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Stream.of(new Employee(121, "Swathi", 97000.45),
				new Employee(122, "Anjali", 97600.45),
				new Employee(123, "Rani", 98000.45),
				new Employee(124, "mamatha", 98800.45),
				new Employee(125, "Sasi", 99000.45)).toList();
		
		// convert list into map
		
		Map<Integer, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(Employee::getEmpId, employee-> employee));
		
		//System.out.println(employeeMap);
		
		employeeMap.forEach((k, v) -> {
			
			if(v.getEmpSalary()>=95000.00) {
			System.out.println(k + ": " + v);
			}
		});
		
		
		
	}

}
