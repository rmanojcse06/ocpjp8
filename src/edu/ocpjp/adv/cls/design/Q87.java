package edu.ocpjp.adv.cls.design;

import java.util.Arrays;
import java.util.List;

class Product{
	String name;
	int qty;
	@Override
	public String toString() {
		return name;
	}
	public Product(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	public static class ProductFilter {
		public static boolean isAvailable(Product p) {
			return p.qty>=10;
		}
	}
}
public class Q87 {
public static void main(String[] args) {
	List<Product> products = Arrays.asList(
								new Product("MotherBoard", 5),
								new Product("Speaker",20)
							);
	products.stream()
			 .filter(Product.ProductFilter::isAvailable)
			 .forEach(p->System.out.println(p));
}
}
