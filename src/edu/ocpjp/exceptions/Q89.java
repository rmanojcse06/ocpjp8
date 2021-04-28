package edu.ocpjp.exceptions;

public class Q89 {
public static void main(String[] args) {
try { doStuff(null); }catch(NullPointerException nfe) { System.out.println("-catch-"); }	
}
public static void doStuff(String s) {
	try { if(null == s) {throw new NullPointerException();} }finally { System.out.println("-finally-"); }
	System.out.println("-doStuff-");
}
}
