package edu.ocpjp.samples;

import java.util.ArrayDeque;
import java.util.Queue;

public class QS6 {
public static void main(String[] args) {
	Queue<String> products = new ArrayDeque<String>();
	 products.add("p1");
	 products.add("p2");
	 products.add("p3");
	 System.out.print(products.peek());
	 System.out.print(products.poll());
	 System.out.println("");
	 products.forEach(s -> System.out.print(s));
}
}
