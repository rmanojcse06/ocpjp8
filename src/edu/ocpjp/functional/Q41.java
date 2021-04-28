package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Q41 {
public static void main(String[] args) {

	List<Integer> codes = Arrays.asList(10,20);
	UnaryOperator<Integer> uo = s->s+10;
	codes.replaceAll(uo);
	codes.forEach(System.out::println);
	
	System.out.println("--------------------------------------------------------");
	List<String> list = Arrays.asList("my","pen","is","your","pen");
	Predicate<String> test = s->{
		int i=0;
		boolean containsPen = s.contains("pen");
//		System.out.println(s+"="+(i++)+":");
		return containsPen;
	};
	list.stream().filter(test).allMatch(test);
	System.out.println("--------------------------------------------------------");
}
}
