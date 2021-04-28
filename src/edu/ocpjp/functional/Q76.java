package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q76 {
public static void main(String[] args) {
 List<TechName> list = Arrays.asList(new TechName("Java-"),new TechName("Oracle DB-"),new TechName("J2EE-"));
 Stream<TechName> s = list.stream();
 s
 	.map(a->a.techName)
 	.forEachOrdered(System.out::println);
}
}
class TechName{
String techName;
public TechName(String techName) {
this.techName = techName;
}	
}
