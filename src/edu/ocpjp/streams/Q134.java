package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q134 {
public static void main(String[] args) {
	class Person{
		String name;
		int age;
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
	}
	List<Person>pList=Arrays.asList(new Person("Jack", 30),new Person("Mike Hill", 21),new Person("Thomas Hill", 24));
	Stream<Person>resList=pList.stream().filter(s->s.getAge()>=25);
	long count=resList.filter(s->s.getName().contains("Hill")).count();
	System.out.println(" Count => "+count);
}
}
