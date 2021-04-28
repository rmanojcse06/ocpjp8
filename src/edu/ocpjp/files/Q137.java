package edu.ocpjp.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Q137 {
public static void main(String[] args) {
	try(FileInputStream fis=new FileInputStream("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\version.txt")){
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		if(br.markSupported()) {
			System.out.print((char)br.read());//a
			br.mark(1);
			System.out.print((char)br.read());//b
			br.reset();
			System.out.print((char)br.read());//b
			br.reset();
			System.out.print((char)br.read());//c
			br.mark(3);
			System.out.print((char)br.read());//c
			br.reset();
			System.out.print((char)br.read());//d
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
