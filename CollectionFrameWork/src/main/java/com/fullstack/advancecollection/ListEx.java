package com.fullstack.advancecollection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	private int empId;
	private String empNameString;
	private double empSalary;
	public Employee(int empId, String empNameString, double empSalary) {
		super();
		this.empId = empId;
		this.empNameString = empNameString;
		this.empSalary = empSalary;
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpNameString() {
		return empNameString;
	}


	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNameString=" + empNameString + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class ListEx {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Stream.of(new Employee(121, "Swathi", 97000.45),
				new Employee(122, "Anjali", 97600.45),
				new Employee(123, "Rani", 98000.45),
				new Employee(124, "mamatha", 98800.45),
				new Employee(125, "Sasi", 99000.45)).toList();
		
		
		/*
		 * //sort by name
		 * 
		 * employeeList.stream().sorted(Comparator.comparing(Employee::getEmpNameString)
		 * ).forEach(System.out::println);
		 * 
		 * //sort by Salary
		 * 
		 * employeeList.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).
		 * forEach(System.out::println);
		 * 
		 * //filter data by salary
		 * 
		 * employeeList.stream().filter(emp->emp.getEmpSalary()>=95000.00).forEach(
		 * System.out::println);
		 */
		
		//second  largest salary record
		
		Employee employee=employeeList.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).toList().get(0);
		
		System.out.println(employee);
		
	}

}
