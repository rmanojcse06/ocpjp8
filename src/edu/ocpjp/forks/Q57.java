package edu.ocpjp.forks;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread{
	CyclicBarrier cb;
	Worker(CyclicBarrier cb){
		this.cb = cb;
	}
	@Override
	public void run() {
		try {
			System.out.println("Worker: Started");
			this.cb.await();
		}catch(Throwable t) {
			t.printStackTrace();
		}finally {
			System.out.println("Worker: End");
		}
	}
}

class Master implements Runnable{
	public void run() {
		try {
			System.out.println("Master:Started");
			Thread.sleep(1500L);
		}catch(Throwable t) {
			t.printStackTrace();
		}finally {
			System.out.println("Master:End");
		}
	};
}
public class Q57 {
public static void main(String[] args) {
	Master master = new Master();
	CyclicBarrier cb = new CyclicBarrier(2);
	Worker w1 = new Worker(cb);
	w1.start();
	Worker w2 = new Worker(cb);
	w2.start();
}
}
