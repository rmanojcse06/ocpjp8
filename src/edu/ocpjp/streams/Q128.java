package edu.ocpjp.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Q128 {
public static void main(String[] args) {
	Map<Integer,Integer>m=new HashMap<>();
	m.put(1,10);
	m.put(2,20);
	{
		BiConsumer<Integer, Integer>c=(i,j)->System.out.print(i+","+j+";");
		c.accept(1,2);
		m.forEach(c);
	}
}
}
