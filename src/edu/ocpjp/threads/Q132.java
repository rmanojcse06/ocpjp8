package edu.ocpjp.threads;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Q132 {
public static void main(String[] args) {
	final List<String> list = new CopyOnWriteArrayList<>();
	final AtomicInteger atomInt = new AtomicInteger(0);
	final CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
		@Override
		public void run() {
			System.out.println(list);
		}
	});
	Runnable r = new Runnable() {
		@Override
		public void run() {
			try {
				Thread.sleep(1000L*atomInt.incrementAndGet());
				list.add("X");
				barrier.await();
			}catch(Throwable t) {
				t.printStackTrace();
			}
		}
	};
	for(int i=1;i<20;i++) {
		System.out.println("Thread-"+i);
		new Thread(r).start();
	}
}
}
