package edu.ocpjp.streams;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Q150 {
public static void main(String[] args) {
	IntConsumer consumer=e->System.out.print(e);
	Integer value=90;
	Integer result=null;
	Function<Integer,Integer>f1=e->e+10;
	result=f1.apply(value);
	System.out.println("\n\nFunction(f1)="+result);
	consumer.accept(result);
	
	IntFunction<Integer> f2=e->e+10;
	result=f2.apply(value);
	System.out.println("\n\nFunction(f2)="+result);
	consumer.accept(result);
	
	ToIntFunction<Integer> f3=e->e+10;
	result=f3.applyAsInt(value);
	System.out.println("\n\nFunction(f3)="+result);
	consumer.accept(result);
}
}
