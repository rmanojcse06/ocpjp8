package edu.ocpjp.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q86 {
public static void main(String[] args) {
	Path p1 = Paths.get("/software/././sys/readme.txt");
	Path p2 = p1.normalize();
	Path p3 = p2.relativize(p1);
	
	
	System.out.print(p1.getNameCount());
	System.out.print(" : "+p2.getNameCount());
	System.out.print(" : "+p3.getNameCount());
	
	System.out.println("\n\n\n");
	System.out.println("p1="+p1);
	System.out.println("p2="+p2);
	System.out.println("p3="+p3);

	
	Path p4 = Paths.get("/hardware/sys/dell/dev/readme.txt");
	Path p5 = p1.relativize(p4);
	System.out.println("p5="+p5+"\tcount="+p5.getNameCount());
	
	
	
	
	System.out.println("over");
}
}
