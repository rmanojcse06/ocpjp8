package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q93 {
public static void main(String[] args) {
	List<String> aList = Arrays.asList("Java","J2EE","J2ME","JSTL","JSP","Oracle DB");
	Predicate<String> v = p->p.contains("J");
	List<String> bList = aList.stream().filter(x->x.length()>3).filter(v).collect(Collectors.toList());
	System.out.println(bList);
}
}
