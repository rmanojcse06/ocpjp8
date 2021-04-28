package edu.ocpjp.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q36Product {
	int id;
	int price;
	public Q36Product(int id, int price) {
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Q36Product [id=" + id + ", price=" + price + ", hashcode="+hashCode()+"]";
	}
}
public class Q36 {
	public static void main(String[] args) {
		List<Q36Product> products = Arrays.asList(
					new Q36Product(1,10),
					new Q36Product(2,30),
					new Q36Product(2,30)
				);
		Q36Product accumulator = new Q36Product(4,0);
		System.out.println("accumulator:="+accumulator.hashCode());
		Q36Product pdt = products.stream().reduce(accumulator,(a,b)->{
			System.out.println("a:="+a.hashCode()+"; b:="+b.hashCode());
			accumulator.price = a.price + b.price;
			return accumulator;
		});
		products = new ArrayList<Q36Product>(products);
		products.add(pdt);
		System.out.println("pdt:="+pdt.hashCode());
		System.out.println("==================================");
		products.stream().parallel().reduce((a,b)->(a.price > b.price)?a:b).ifPresent(System.out::println);
	}
}
