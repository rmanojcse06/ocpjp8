package edu.ocpjp.streams;

import java.util.function.Predicate;

public class Q110 {
public static void main(String[] args) {
	Predicate<String> lengthValidator = s->s.length()>5&&s.length()<10;
	boolean res=lengthValidator.test("Hello");
	System.out.println("Res="+res);
}
}
