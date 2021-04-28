package edu.ocpjp.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Q144 {
public static void main(String[] args) {
	class Person implements Comparable<Person>{
		String name;
		Person(String n){this.name=n;}
		public int compareTo(Person p) {
			return this.name.compareTo(p.name);
		}
		@Override
		public String toString() {
			return this.name;
		}
	}
	Function<String,Person>f1=(s)->new Person(s);
	List<Person>pList=Arrays.asList(f1.apply("Manoj"),f1.apply("Sanjana"));
	Collections.sort(pList);
	pList.forEach(System.out::println);
}
}
