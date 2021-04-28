package edu.ocpjp.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class QStream {
public static void main(String[] args) {
	Predicate<String>p1=s->s.length()>10;
	System.out.println(p1.test("1234567890123"));
	Supplier<String>s1=String::new;
	Consumer<String>c1=System.out::println;
	Function<String,String>f1=s->"Hello "+s;
	c1.accept(f1.apply(s1.get()));
}
}
