package edu.ocpjp.asserts;

public class Q111 {
public static void main(String[] args) {
	class Product{
		public double applyDiscount(double price) {
			assert(price>0):"Price is less than 0";
			return price*0.50d;
		}
	}
	Product p = new Product();
	double newP=p.applyDiscount(Double.parseDouble("0"));
	System.out.println("New Price : "+newP);
}
}
