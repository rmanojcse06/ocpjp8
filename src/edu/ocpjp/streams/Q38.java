package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q38 {
	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe","Paul","Alice","Tom");
//		listVal.stream().filter(a->a.length()>3).mapToInt(a->a.length()).forEach(System.out::println);
		List ax = listVal.stream().map(a->a.length()>3).collect(Collectors.toList());
		System.out.println(ax);
	}
}
