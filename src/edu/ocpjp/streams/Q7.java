package edu.ocpjp.streams;

import java.util.function.Supplier;

class Bird{
	public Bird() {
		System.out.println("Bird()");
	}
	public void fly() {
		System.out.println("Bird::fly -> can fly");
	}
}
class Penguin extends Bird{
	public Penguin() {
		System.out.println("Penguin()");
	}
	public void fly() {
		System.out.println("Penguin::fly -> cannot fly");
	}
}



public class Q7 {
	
	static void fly(Supplier<Bird> x) {
		x.get().fly();
	}
	
public static void main(String[] args) {
	fly(()->new Bird());
	fly(Penguin::new);
}
}
