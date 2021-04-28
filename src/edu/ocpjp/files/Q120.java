package edu.ocpjp.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q120 {
public static void main(String[] args) throws Throwable {
	
	System.out.println("----------------------------- Files.list ----------------------------------");
	
	Stream<Path>s1=Files.list(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\app\\"));
	s1.map(c->{
		try {
			return Files.readAllLines(c);
		} catch (IOException e) {
			return null;
		}
	})
	.filter(c->c!=null)
	.flatMap(r->r.stream())
	.forEach(System.out::println);
	
	System.out.println("----------------------------- Files.lines ----------------------------------");
	
	Stream<String>s2=Files.lines(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\app\\customer.txt"));
	s2.forEach(System.out::println);
}
}
