package edu.ocpjp.functional;

public class Q131 {
public static void main(String[] args) {
	{
		P px=()->System.out.println("P::m1()");
		px.m1();
	}
	{
		Q qx=()->System.out.println("Q::m1()");
		qx.m1();
	}
	{
//		R rx=()->System.out.println("R::m1()");
//		rx.m2();
	}
	{
//		S sx=()->System.out.println("S::m()");
//		sx.m();
	}
	{
//		T tx=()->System.out.println("T::m1()");
//		tx.m();
	}
	{
		V vx=()->System.out.println("V::m2()");
		vx.m1();
		vx.m2();
	}
	{
		W wx=()->System.out.println("W::m1()");
		wx.m1();
		wx.m();
	}
}
interface P{public void m1();}
interface Q extends P{public void m1();}
interface R extends P{public void m2();}
interface S{public default void m() {System.out.println("S::m1()");};}
interface T{public void m1();public void m2();}
interface U{public void m1();public abstract void m2();}
interface V{public default void m1() {System.out.println("V::m1()");};public abstract void m2();}
interface W extends P{public default void m() {System.out.println("W::m()");};}
}

