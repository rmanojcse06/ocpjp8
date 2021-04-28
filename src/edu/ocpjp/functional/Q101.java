package edu.ocpjp.functional;

import java.util.function.UnaryOperator;

public class Q101 {
public static void main(String[] args) {
	final String str = "JAVA";
	StringBuffer buf = new StringBuffer("Course");
	UnaryOperator<String> u1 = (str2) -> str.concat(str2);
	UnaryOperator<String> u2 = (str3) -> str3.toLowerCase();
	System.out.println(u2.apply(buf.toString()));
}
}
