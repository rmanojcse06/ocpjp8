package edu.ocpjp.exceptions;
public class Q99 {
public static void main(String[] args) {
	Resource r1 = new Resource();
	try {
		r1.open();
		r1.close();
	}catch(Exception e) {
		System.out.println("Exception-1");
	}
	try(Resource r2= new Resource()){
		r2.open();
	}catch(Exception e) {
		System.out.println("Exception-2");
	}
}
}

class Resource implements AutoCloseable{
	public void open() {
		System.out.println("Resource::open");
	}
	public void close() throws Exception {
		System.out.println("Resource::close");
	}
}
