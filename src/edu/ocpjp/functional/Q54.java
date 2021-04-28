package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Q54 {
public static void main(String[] args) {
	List<Integer> iList = Arrays.asList(10,20,30);
	UnaryOperator<Double> uo = s -> s+3;
	iList.replaceAll(uo);
	iList.stream()
			.flatMap(a->Stream.of("val: "+a))
			.forEach(System.out::println);
}
}
