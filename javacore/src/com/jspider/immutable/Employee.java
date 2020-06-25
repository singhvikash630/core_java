package com.jspider.immutable;

public final class Employee{
    private final int id;
    private Address address;
    public Employee(int id, Address address)
    {
        this.id = id;
        this.address=new Address();  // defensive copy
        this.address.setStreet( address.getStreet() );
    }
    public int getId(){
        return id;
    }
    public Address getAddress(){
    	Address add=new Address();
    	add.setStreet(address.getStreet());
        return add;
    }
}