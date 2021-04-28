package edu.ocpjp.forks;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction{
	public static final int THRESHOLD_SZ = 3;
	int[] data;
	int stIndex;
	int lstIndex;
	
	public Sum(int[] data, int start, int end) {
		super();
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}



	@Override
	protected void compute() {
		int sum=0;
		if(lstIndex - stIndex <= THRESHOLD_SZ) {
			for(int i=stIndex; i<lstIndex; i++) {
				sum = sum + data[i];
			}
			System.out.println("["+stIndex+","+lstIndex+"] = "+ sum);
		} else {
			new Sum(data,stIndex + THRESHOLD_SZ, lstIndex).fork();
			new Sum(data,stIndex, Math.min(stIndex + THRESHOLD_SZ, lstIndex)).compute();
		}
	}
}

public class Q9 {
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		int[] data = new int[] {1,2,3,4,5,6,7,8,9,10};
		pool.invoke(new Sum(data,0,data.length));
		
	}
}
