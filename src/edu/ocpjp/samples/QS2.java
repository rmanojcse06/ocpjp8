package edu.ocpjp.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Toy{
	double price;
	String color;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Toy(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	
}

public class QS2 {
public static void main(String[] args) {
	List<Toy> list = new ArrayList<Toy>();
	list.add(new Toy(10.0d, "red"));
	list.add(new Toy(20.0d, "yellow"));
	list.add(new Toy(15.0d, "red"));
	
	System.out.println("Sum of reds => "+list.stream().filter(s->s.color == "red").mapToDouble(s->s.price).sum());;
	System.out.println("Flat Mapper ====> ");
	list.stream().filter(s->s.color == "red")
	.flatMap(s->Stream.of(s.getPrice())).forEach(System.out::println);
	
	System.out.println("Mapper ====> ");
	list.stream().filter(s->s.color == "red")
	.map(s->s.getPrice()).forEach(System.out::println);
	
	System.out.println("Peek ====> ");
	list.stream().filter(s->s.color == "red")
	.peek(s->s.getPrice()).forEach(System.out::println);
}
}
