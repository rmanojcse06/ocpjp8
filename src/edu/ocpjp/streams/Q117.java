package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;

public class Q117 {
public static void main(String[] args) {
	List<String>vList=Arrays.asList("","George","John","Jim");
	Long c=vList.stream().filter(x->!x.isEmpty()).count();
	System.out.println("c="+c);
}
}
