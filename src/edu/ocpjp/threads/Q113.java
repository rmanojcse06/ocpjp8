package edu.ocpjp.threads;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class R implements Runnable{public void run() {System.out.println("inside run");}}

class C implements Callable<String>{public String call() throws Exception {System.out.println("inside call");return "call";}}

public class Q113 {
public static void main(String[] args){
	try {
	ExecutorService es=Executors.newSingleThreadExecutor();
	es.execute(new R());
	Future<String>f=es.submit(new C());
	System.out.println(f.get());
	es.shutdown();
	}catch(InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
}
}
