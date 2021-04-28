package edu.ocpjp.functional;

import java.util.Optional;

class Employee{
	Optional<Address> address;

	public Employee(Optional<Address> address) {
		this.address = address;
	}
	
	public Optional<Address> getAddress() {
		return address;
	}
	
}
class Address {
	String city="New York";
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return city;
	}
}

public class Q30Emp {
	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addr1 = Optional.ofNullable(address);
		Employee e1 = new Employee(addr1);
		String eAddr = addr1.isPresent()?addr1.get().getCity():"Not Found";
		System.out.println("ADDR ="+eAddr);
	}
}
