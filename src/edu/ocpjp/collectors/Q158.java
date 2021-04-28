package edu.ocpjp.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Q158Student{
	String course,name,city;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Q158Student(String name, String course,  String city) {
		super();
		this.course = course;
		this.name = name;
		this.city = city;
	}
	
}
public class Q158 {
public static void main(String[] args) {
	List<Q158Student> list = Arrays.asList(
			new Q158Student("Jessy", "Java ME", "Chicago"),
			new Q158Student("Helen", "Java ME", "Houston"),
			new Q158Student("Mark", "Java ME", "Chicago")
			);
	
	list.stream().collect(Collectors.groupingBy(Q158Student::getCourse))
	.forEach((a,b)->System.out.println(a));
	
}
}
