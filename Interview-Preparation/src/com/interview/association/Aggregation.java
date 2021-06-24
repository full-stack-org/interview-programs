package com.interview.association;

class Emp {
	String name;
	Address address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
class Address {
	String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

public class Aggregation {
	public static void main(String[] args) {
	Emp emp = new Emp();
	emp.setName("Sunny");
	Address address = new Address();
	address.setCity("Hyderabad");
	emp.setAddress(address);
	System.out.println(emp.getName() + " "+ emp.getAddress().getCity());//Sunny Hyderabad

	}

}
