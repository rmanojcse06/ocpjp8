package edu.ocpjp.io;

import java.io.Console;

public class Q107 {
public static void main(String[] args) {
	Console c=System.console();
	if(null==c) {
		System.out.println("console is null");
	}else {
	char[]pwd=c.readPassword("Enter Password : ");
	String password=new String(pwd);
	}
}
}
