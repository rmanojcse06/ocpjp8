package edu.ocpjp.adv.cls.design;


// type-1 : Member Inner Class
class OuterClassOne{
	int a;
	private final class InnerClass{
		private int b;
		public void setB(int b) {
			this.b = b;
		}
		public int getB() {
			return b;
		}
	}
	public void setA(int a) {
		this.a = a;
	}
	public InnerClass bClass = null; 
	public void setB(int b) {
		if(null == bClass) {
			bClass = new InnerClass();
		}
		bClass.setB(b);
	}
	public int getA() {
		return a;
	}
	public int getB(){
		return (null == bClass)?Integer.MIN_VALUE:bClass.b;
	}
	public InnerClass getbClass() {
		return bClass;
	}
	public OuterClassOne(int a, int b) {
		setA(a);
		setB(b);
	}
}


// type-2 : Local Inner Class
class OuterClassTwo{
	int a;
	Object inner;
	public void setA(int a) {
		class InnerClass{
			int a;
			public InnerClass(int a) {
				this.a = a;
			}
			public int getA() {
				return a;
			}
		}
		InnerClass aClass = new InnerClass(a);
		this.a = a;
		this.inner = aClass;
	}
	public void setB(int b) {
		class InnerClass{
			int b;
			public InnerClass(int b) {
				this.b = b;
			}
			public int getA() {
				return ((InnerClass)OuterClassTwo.this.inner).b;
			}
		}
		try {
		this.a = (new InnerClass(b)).getA();
		System.out.println("setB("+b+") => "+this.a);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
}

//type-3 : Anonymous Inner Class
class OuterClassThree{
	interface One{
		public abstract void method1();
	}
	interface Two extends One{
		public abstract void method2();
	}
	final class Three implements Two{
		@Override
		public void method1() {
			System.out.println("3::m1=>"+this.getClass());	
		}
		@Override
		public void method2() {
			System.out.println("3::m2=>"+this.getClass());
		}
	}
	public OuterClassThree() {}
	One o;
	Two t;
	void exec() {
		o = new Two() {
			
			@Override
			public void method1() {
				System.out.println("2::exec::m1=>"+this.getClass());	
			}
			
			@Override
			public void method2() {
				System.out.println("2::exec::m2=>"+this.getClass());	
				
			}
		};
		o.method1();
		t = new Three();
		t.method2();
		t = (Two)o;
		t.method2();
	}
}

public class OuterInnerClassTypes {
	public static void main(String[] args) {
		{
			OuterClassOne o = new OuterClassOne(2,4);
			System.out.println("a:="+o.getA()+"; b:="+o.getB());
		}
		{		
			OuterClassTwo o = new OuterClassTwo();
			o.setA(1);
			o.setB(2);
		}
		{		
			OuterClassThree o = new OuterClassThree();
			o.exec();
		}
	}
}
