package com.gaurav.cave.factory;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person() {
		
	}
	
	public static Person getInstance() {
		return new Person();
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method.");
		return new Person(id, name);
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}
}
