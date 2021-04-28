package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;

public class Q125 {
public static void main(String[] args) {
	List<Integer>li=Arrays.asList(3,4,5);
	li.stream()
		.filter(e->e>4)
			.peek(e->System.out.print("Price: "+e))
		.map(e->e-1)
			.forEach(e->System.out.print("New Price: "+e));
}
}
