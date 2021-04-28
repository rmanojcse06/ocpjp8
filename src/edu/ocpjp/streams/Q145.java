package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;

public class Q145 {
public static void main(String[] args) {
	class Person{
		String n;int s;
		Person(String n,int s){this.n=n;this.s=s;}
		public int getS() {
			return s;
		}
	}
	List<Person>pList=Arrays.asList(new Person("Smith",1525),new Person("Jack",1000),new Person("Jim",2000));
	System.out.println(" dVal="+pList.stream().filter(p->p.n.startsWith("J")).mapToInt(Person::getS).average().getAsDouble());
}
}
