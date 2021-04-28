package edu.ocpjp.adv.cls.design;

public class Q121 {
public static void main(String[] args) {
	MyTest t1=null;
	try(MyTest t2=new MyTest()){
		t2.test=100;
		t1=t2.copyObject();
	}catch(Throwable t) {
		t.printStackTrace();
	}
	System.out.println("test="+t1.test);
}
}
class MyTest implements AutoCloseable{
	public MyTest copyObject(){return this;}
	public void close() throws Exception {}
	int test;
}
