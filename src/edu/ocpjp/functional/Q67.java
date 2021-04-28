package edu.ocpjp.functional;

import java.util.function.BiFunction;

public class Q67 {
public static void main(String[] args) {
	BiFunction<Integer, Double, Double> f1 = (t1,t2)->t1+t2;
	Double val = f1.apply(10, 10.2d);
	System.out.println(val);
}
}
