package edu.ocpjp.adv.cls.design;

public class Q127 {
public static void main(String[] args) {
PC1<Number,Integer> p1=new PC1<Number,Integer>();
PC1<Integer,Integer> p2=new PC1<Integer,Integer>();
PC1<Number,Number> p3=new PC1<Number,Number>();
//PC1<Number,String> p4=new PC1<Number,String>();

}
}
class PC1<T,S extends T>{
	T k;
	S v;
}
class PC2<T,S> {
	public static <T,S> m1 (<? extends T> a,S b);
}
