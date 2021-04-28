package edu.ocpjp.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q80 {
public static void main(String[] args) throws IOException {
	BufferedReader br1=null;
	try(BufferedReader br = new BufferedReader(new FileReader("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\colors\\yellow.txt"))){
		br.lines().forEach(System.out::println);
		br1=br;
	}
	br1.ready();
}
}
