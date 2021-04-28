package edu.ocpjp.adv.cls.design;
public class Q94 {
public static void main(String[] args) {
	class Product {
		String pname;
		public Product(String pname) {
		 this.pname = pname;
		}
	}

	Product p1 = new Product("PowerCharger");
	Product p2 = p1;
	System.out.println(p1.equals(p2));
	Product p3 = new Product("PowerCharger");
	System.out.println(p1.equals(p3));
}
}



