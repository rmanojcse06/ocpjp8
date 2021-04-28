package edu.ocpjp.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction {
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;
	
	
	
	public Sum(int[] data, int stIndex, int lstIndex) {
		System.out.println("Sum ("+stIndex+"; "+lstIndex+"; "+java.util.Arrays.toString(data)+")");
		this.stIndex = stIndex;
		this.lstIndex = lstIndex;
		this.data = data;
	}



	@Override
	protected void compute() {
		int sum = 0;
		if ( lstIndex-stIndex <= THRESHOLD_SIZE ) {
			for ( int i=stIndex; i<lstIndex; i++) {
				sum += data[i];
			}
			System.out.println(" compute ("+stIndex+","+lstIndex+"):: sum="+sum);
		} else {
			new Sum(data, stIndex+THRESHOLD_SIZE, lstIndex).fork();
			new Sum(data, stIndex, Math.min(lstIndex, stIndex+THRESHOLD_SIZE)).compute();
		}
	}
}

public class Q9 {
public static void main(String[] args) {
	ForkJoinPool fjp = new ForkJoinPool();
	int[] data= {1,2,3,4,5,6,7,8,9,10};
	fjp.invoke(new Sum(data, 0, data.length));
}
}
