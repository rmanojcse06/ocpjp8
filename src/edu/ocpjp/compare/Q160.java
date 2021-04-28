package edu.ocpjp.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String name, dept;

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	
	
}
public class Q160 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Ada", "sales"),
				new Employee("Bob", "sales"),
				new Employee("Bob", "hr"),
				new Employee("Eva", "hr")
				);
		
		list.stream()
			.sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getName))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}
}
