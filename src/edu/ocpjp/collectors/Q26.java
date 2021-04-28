package edu.ocpjp.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String fName,lName;
	public Employee(String f, String l) {
		this.fName = f;
		this.lName = l;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	@Override
	public String toString() {
		return this.fName+" "+this.lName;
	}
}

public class Q26{
	
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("John","Smith"),new Employee("Peter","Sam"),new Employee("Thomas","Wale"));
		empList.stream().sorted(Comparator.comparing(Employee::getfName).reversed().thenComparing(Employee::getlName)).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
