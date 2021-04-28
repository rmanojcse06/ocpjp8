package edu.ocpjp.functional;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Q58 {
	public static void main(String[] args) {
		String s = "Java is a programming language.";
		ToIntFunction<String> fn = s::indexOf;
		System.out.println(" ToIntFunction => "+fn.applyAsInt("is"));
		
		IntFunction<String> f2 = i->"Index is "+i;
		System.out.println("  "+f2.apply(52));
		
		UnaryOperator o3 = (Object i)->"[Q58]::"+System.currentTimeMillis()+" "+i;
		System.out.println(o3.apply(567d));
	}
}
