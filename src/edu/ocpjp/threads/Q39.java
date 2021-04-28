package edu.ocpjp.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String>{
	String s;
	public Caller(String s) {
		this.s = s;
	}
	@Override
	public String call() throws Exception {
		return "Caller:".concat(this.s);
	}
}
class Runner implements Runnable{
	String s;
	public Runner(String s) {
		this.s = s;
	}
	@Override
	public void run() {
		System.out.println("Runner:".concat(this.s));
	}
}
public class Q39 {
public static void main(String[] args) throws Exception{
	ExecutorService es = Executors.newFixedThreadPool(2);
	Future f1 = es.submit(new Caller("call"));
	Future f2 = es.submit(new Runner("run"));
	System.out.println((String)f1.get()+" :: "+(String)f2.get());
	
	
	
//	es.shutdown();
}
}
