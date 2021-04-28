package edu.ocpjp.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Q12 {
public static void main(String[] args) {
	Path file = Paths.get("../edu.ocpjp.ws/resources/courses.txt");
	try {
		List<String> list = Files.readAllLines(file);
		list.stream().forEach(line->System.out.println("<START>"+line+"<END>"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		Stream<String> lines = Files.lines(file);
		System.out.println(lines.allMatch(t->{return t.isEmpty() || t.contains("=");}));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
