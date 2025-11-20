package com.fullstack.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	private int empId;
	
	private String empNameString;
	
	private int empAge;
	
	private double empSalary;

	public Employee(int empId, String empNameString, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empNameString = empNameString;
		this.empAge = empAge;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNameString=" + empNameString + ", empAge=" + empAge + ", empSalary="
				+ empSalary + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		
		if(empAge==e1.empAge) {
		return 0;
	}else if(empAge >e1.empAge) {
		return 1;
		
		
	}else {
		return -1;
	}
		
	}

	
	
}
public class ComparableEx {
	
	public static void main(String[] args) {
		
		/*
		 * List<Employee> employeeList= (List<Employee>) Stream.of(new Employee(121,
		 * "Dev", 21, 97000.45), new Employee(122, "Devasena", 22, 95000.45), new
		 * Employee(121, "Nani", 21, 96000.45), new Employee(121, "Hari", 21, 98000.45),
		 * new Employee(121, "Devii", 21, 99000.45));
		 */
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(121, "Dev", 21, 97000.45));
		employeeList.add(new Employee(122, "Dev", 22, 95000.45));
		employeeList.add(new Employee(123, "Dev", 23, 96000.45));
		employeeList.add(new Employee(124, "Dev", 24, 98000.45));
		employeeList.add(new Employee(125, "Dev", 25, 99000.45));
		Collections.sort(employeeList);
		
		employeeList.forEach(System.out::println);
		
		
		
	}

}
