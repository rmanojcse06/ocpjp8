package edu.ocpjp.adv.cls.design;

public class Q141 implements Interface1,Interface2{
public static void main(String[] args) {
Interface1 x=new Q141();
x.sayHi();
}
@Override
public void sayHi() {
System.out.println("Hi Q141!");
}
}
interface Interface1{
	public default void sayHi() {
		System.out.println("Hi Interface1");
	}
}
interface Interface2{
	public default void sayHi() {
		System.out.println("Hi Interface2");
	}
}
