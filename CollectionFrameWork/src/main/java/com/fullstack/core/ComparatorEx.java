package com.fullstack.core;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer{
	
	private int custId;
	
	private String custNameString;
	
	private int custAge;

	public Customer(int custId, String custNameString, int custAge) {
		super();
		this.custId = custId;
		this.custNameString = custNameString;
		this.custAge = custAge;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustNameString() {
		return custNameString;
	}

	public void setCustNameString(String custNameString) {
		this.custNameString = custNameString;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custNameString=" + custNameString + ", custAge=" + custAge + "]";
	}
	
	
}


class NameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getCustNameString().compareTo(c2.getCustNameString());
	}
	
	
}

class AgeComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		
		if(c1.getCustAge()==c2.getCustAge()) {
			return 0;
		}else if(c1.getCustAge()>c2.getCustAge()) {
			return 1;
		}else {
			return -1;
			
		}
		
	}
	
	
}
public class ComparatorEx {
	
	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer(121, "Rani", 21));
		customerList.add(new Customer(122, "Neetu", 25));
		customerList.add(new Customer(123, "Pavani", 23));
		customerList.add(new Customer(124, "Supraja", 22));
		customerList.add(new Customer(125, "Anjali", 24));
		
		
		System.out.println("**************NAME COMPARATOR****************");
		
		Collections.sort(customerList, new NameComparator());
		
		customerList.forEach(System.out::println);
		
		System.out.println("\n \n \n");
		
System.out.println("**************Age COMPARATOR****************");
		
		Collections.sort(customerList, new AgeComparator());
		
		customerList.forEach(System.out::println);
		
		
		
	}

}
