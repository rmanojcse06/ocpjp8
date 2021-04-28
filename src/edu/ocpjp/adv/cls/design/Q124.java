package edu.ocpjp.adv.cls.design;

public class Q124 {
	public static void main(String[] args) {
		Q124Foo<String,Integer>mark=new Q124Foo<String,Integer>("A", 2);
		System.out.println("mark::k="+mark.getKey()+";v="+mark.getVal());
		Q124Foo<String,String>pair=Q124Foo.<String>twice("Hello World");
		System.out.println("pair::k="+pair.getKey()+";v="+pair.getVal());
		Q124Foo<String,String>grade=new Q124Foo<>("A", "B");
		System.out.println("grade::k="+grade.getKey()+";v="+grade.getVal());
		
//		Q124Foo<Object,Object>per=new Q124Foo<String,Integer>("A", 3);
//		System.out.println("per::k="+per.getKey()+";v="+per.getVal());
		
	}
}

class Q124Foo<K,V>{
	private K key;
	private V val;
	public K getKey() {return key;}
	public V getVal() {return val;}
	public Q124Foo(K k, V v) {this.key = k;this.val = v;}
	public static<T>Q124Foo<T,T> twice(T v){return new Q124Foo<T,T>(v,v);}
}