package edu.ocpjp.adv.cls.design;

class Foo { public void methodB(String s) {System.out.println("Foo::"+s);}}
class Bar extends Foo { public void methodB(String s) {System.out.println("Bar::"+s);}}
class Baz extends Bar { public void methodB(String s) {System.out.println("Baz::"+s);}}
class Daze extends Baz { Bar bb=new Bar(); public void methodB(String s) {System.out.println("Daze-1::"+s);bb.methodB(s);System.out.println("Daze-2::"+s);super.methodB(s);}}

public class Q90 {
public static void main(String[] args) {
	Baz d = new Daze();
	d.methodB("Main");
}
}
