package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q119 {
public static void main(String[] args) {
	List<String>words=Arrays.asList("win","try","best","luck","do");
	Predicate<String>t1=w->{System.out.println("Checking...");return w.equals("do");};
	Predicate t2=w->((String)w).length()>3;
	System.out.println(words.stream().filter(t1).filter(t2).count());
}
}
