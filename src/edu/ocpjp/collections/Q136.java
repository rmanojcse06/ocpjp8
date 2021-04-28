package edu.ocpjp.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q136 {
public static void main(String[] args) {
	Deque<Integer>nums=new ArrayDeque<>();
	nums.add(1000);
	System.out.println(nums);
	nums.push(2000);
	System.out.println(nums);
	nums.add(3000);
	System.out.println(nums);
	nums.push(4000);
	System.out.println(nums);
	Integer i1=nums.remove();
	System.out.println(nums);
	Integer i2=nums.pop();
	System.out.println("i1="+i1+" i2="+i2);
}
}
