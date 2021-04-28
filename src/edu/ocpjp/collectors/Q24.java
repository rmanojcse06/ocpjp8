package edu.ocpjp.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class JavaStudent {
	String empName;
	String empDept;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public JavaStudent() {
		
	}
	@Override
	public String toString() {
		return "JavaStudent (empName=" + empName + ", empDept=" + empDept + ")";
	}
	
}
class Student{
	String course, name, city;

	public Student( String name, String course, String city) {
		this.course = course;
		this.name = name;
		this.city = city;
	}
	
	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student (course=" + course + ", name=" + name + ", city=" + city + ")";
	}
	
}


public class Q24 {
	public static void main(String[] args) {
		List<Student> std = Arrays.asList(
					new Student("Jessy","Java ME","Chicago"),
					new Student("Helen","Java EE","Houston"),
					new Student("Mark","Java ME","Chicago"),
					new Student("Nathan","Java ME","India"),
					new Student("Oprah","Java EE","India")
				);
		std.stream().collect(Collectors.groupingBy(Student::getCourse))
			.forEach((src,res)->System.out.println(src));
		
	}
	
}
