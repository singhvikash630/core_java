package com.jspider.immutable;

import java.util.Date;

public class Test {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address();
		address.setStreet("Greater noida");
		Employee emp=new Employee(10, address);
		
		System.out.println(emp.getId()+" Belongs to "+emp.getAddress().getStreet());
		emp.getAddress().setStreet("noidaaaaa");		
		System.out.println(emp.getId()+" Belongs to "+emp.getAddress().getStreet());
		address.setStreet("Delhiaaaa");
		System.out.println(emp.getId()+" Belongs to "+emp.getAddress().getStreet());

	}

}
