package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q69 {
public static void main(String[] args) {
	UnaryOperator<Double> uo = s->s*2;
	List<Double> dList = Arrays.asList(1000.0,2000.0,1600.0,1800d,0.0);
	dList.stream().filter(v->v>=1500.0).map(v->uo.apply(v)).forEach(System.out::println);
}
}
