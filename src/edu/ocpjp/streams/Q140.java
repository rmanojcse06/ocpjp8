package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Q140 {
public static void main(String[] args) {
	List<String>qwords=Arrays.asList("why","what","when");
	BinaryOperator<String>bOper=(s1,s2)->s1.concat(s2);
	String s1=qwords.stream().reduce("Words::", bOper);
	System.out.println("Stream::"+s1);
	
	qwords.stream().map(s->"Words::"+s).forEach(System.out::print);
}
}
