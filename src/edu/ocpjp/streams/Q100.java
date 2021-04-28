package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;

public class Q100 {
public static void main(String[] args) {
	List<String> cs = Arrays.asList("Java","Java EE","Java ME");
	{
		boolean b = cs.stream().findAny().get().equals("Java");
		System.out.println("findAny().get() => "+b);
	}
	{
		boolean b = cs.stream().anyMatch(w->w.equals("Java"));
		System.out.println("anyMatch => "+b);
	}
	{
		boolean b = cs.stream().findFirst().get().equals("Java");
		System.out.println("findFirst().get() => "+b);
	}
	{
		boolean b = cs.stream().allMatch(w->w.equals("Java"));
		System.out.println("allMatch => "+b);
	}
}
}
