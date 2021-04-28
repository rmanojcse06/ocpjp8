package edu.ocpjp.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q2 {
public static void main(String[] args) {
	IntStream s1 = Stream.of (1,2,3).mapToInt(x->x);
	IntFunction<IntUnaryOperator> cfn0 = a -> b -> a*b;
	IntFunction<IntUnaryOperator> cfn1 = a -> {return b->{return a*b;};};
	
	
	IntFunction<IntUnaryOperator> cfn2 = a -> {
											IntUnaryOperator op1 = b -> a*b;
											return op1;
										 };  
	
	s1.map(cfn2.apply(10)).forEach(System.out::print);
	
	
	
	
	System.out.println("\n-------------------------------------------------------------");
	
	List<Integer> list = Arrays.asList(1,2,3);
	list.stream().map(x->x*2).peek(System.out::print).count();
	
	System.out.println("\n-------------------------------------------------------------");
	
	Stream<List<String>> iStream = Stream.of(Arrays.asList("1","John","4"),Arrays.asList("2",null));
	iStream.flatMapToInt((List<String> x)->IntStream.of(x.size()))
				.forEach(System.out::println);
	
	System.out.println("\n-------------------------------------------------------------");
//	Q2 q2 = new Q2();
//	q2.wrong("asdfasd");
}

public void wrong(String s) {
	UnaryOperator<Long> u1 = x->2L;
	Function<List<String>, String> getFirst = x->x.get(0);
	Predicate<String> checkIfNull = String::isEmpty;
	System.out.println("---   unary operator   ---");
	System.out.println(u1.apply(3L));
	System.out.println("--- get first function ---");
	System.out.println(getFirst.apply(new ArrayList<String>() {{add("a");add("b");}}));
	System.out.println("--- check null string ---");
	System.out.println(checkIfNull.test(""));
	System.out.println("--- average :: else(1) ---");
	System.out.println(average(null).orElse(0.0d));
	System.out.println("--- average :: else(2) ---");
	System.out.println(average(1,2,3,4).orElse(0.0d));
	System.out.println("--- average :: else(3) ---");
	System.out.println(average(null).orElseThrow(IllegalArgumentException::new));
}

public Optional<Double> average(int... values){
	if(null == values || values.length<=0) return Optional.empty();
	return Optional.of((double)Arrays.stream(values).sum()/values.length);
}



}
