package edu.ocpjp.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q73 {
public static void main(String[] args) throws Exception{
	ExecutorService es = Executors.newFixedThreadPool(1);
	Future f1 = es.submit(new CallerThread("Call"));
	String s = f1.get().toString();
	System.out.println(s);
   es.shutdown();
}
}
class CallerThread implements Callable{
	String str;
	public CallerThread(String s) {str = s;}
	@Override
	public String call() throws Exception {
		return str.concat("Call");
	}
}