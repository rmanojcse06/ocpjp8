package edu.ocpjp.functional;

import java.util.Optional;

public class Q104 {
public static void main(String[] args) {
	Optional<String>city1=getCountry("Paris");
	Optional<String>city2=getCountry("Las Vegas");
	System.out.println(city1.orElse("Not Found1"));
	if(city2.isPresent())
		city2.ifPresent(x->System.out.println(x));
	else
		System.out.println(city2.orElse("Not Found2"));
}
public static Optional<String>getCountry(String s){
	Optional<String>couName=Optional.empty();
	if("Paris".equals(s)) {
		couName=Optional.of("France");
	}else if("Mumbai".equals(s)) {
		couName=Optional.of("India");
	}
	return couName;
}
}
