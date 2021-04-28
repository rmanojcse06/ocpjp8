package edu.ocpjp.adv.cls.design;

abstract class Shape{
	Shape(){
		System.out.println("Shape");
	}
	protected void area() {
		System.out.println("Shape::area");
	}
}

class Square extends Shape{
	int side;
	public Square(int side) {
		super();
		System.out.println("Square("+side+")");
		this.side = side;
	}
	public void area() {
		System.out.println("Square::area");
	}
}

class Rectangle extends Square {
	int len,br;
	public Rectangle(int l, int b) {
		super(l);
		System.out.println("Rectange("+l+","+b+")");
		len =l;
		br = b;
	}
	public void area() {
		System.out.println("Rectangle::area");
	}
}

public class Q8 {
public static void main(String[] args) {
	
}
}
