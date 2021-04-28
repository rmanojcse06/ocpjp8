package edu.ocpjp.collections;

import java.util.Set;
import java.util.TreeSet;

class Vehicle implements Comparable{
	int vno;
	String name;
	public Vehicle(int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [vno=" + vno + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		return (o instanceof Vehicle)?Integer.compare(this.vno,((Vehicle)o).vno):-1;
	}
}
public class Q32 {
	public static void main(String[] args) {
		Set<Vehicle> vList = new TreeSet<>();
			vList.add(new Vehicle(10123,"Ford"));
			vList.add(new Vehicle(10124,"BMW"));
		System.out.println(vList);
	}
}
