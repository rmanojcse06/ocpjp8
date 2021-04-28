package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Q60 {
public static void main(String[] args) {
	List<String> nL = Arrays.asList("Jim","John","Jeff","Jon","Jack");
	Function<String, String> f1 = s->"Hello ".concat(s)/*.concat(" !")*/;
	nL.stream()
			.skip(1)
			.peek(s->System.out.println("source->"+s))
//				.skip(1)
//				.peek(s->System.out.println("skip->"+s))
//				.filter(s->s.length()>3)
//				.peek(s->System.out.println("filter->"+s))
//			.map(f1)
				//.peek(System.out::print);
//				.forEach(System.out::println)
			;
}
}
