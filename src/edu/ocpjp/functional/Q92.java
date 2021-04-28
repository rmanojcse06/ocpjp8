package edu.ocpjp.functional;

import java.util.function.DoubleSupplier;

class Test1{
	String name;
	Integer cost;
	public Test1(String name, Integer cost) {
		this.name = name;
		this.cost = cost;
	}
	public Integer getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
}

public class Q92 {
public static void main(String[] args) {
	Test1 t1 = new Test1("IT",1);
	DoubleSupplier dS = t1::getCost;
	System.out.println(t1.getName()+"::"+dS.getAsDouble());
}
}
