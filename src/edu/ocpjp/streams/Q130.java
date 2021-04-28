package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Q130 {
public static void main(String[] args) {
	List<Product>li=Arrays.asList(new Product("IV", 1000),new Product("Refridgerator",2000));
	Consumer<Product>raise=e->e.setPrice(e.getPrice()+100);
	li.forEach(raise);
	li.stream().forEach(Product::printVal);
}
}
class Product{
	String name;
	Integer price;
	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getPrice() {
		return price;
	}
	public void printVal() {
		System.out.println("Name:"+name+"Price:"+price+"");
	}
}
