package edu.ocpjp.files;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q133 {
public static void main(String[] args) throws Exception{
	{
		System.out.println("A");
		Stream<Path>s1=Files.list(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\company"));
		s1.forEach(s->System.out.println(s));
	}
	{
		System.out.println("\n\n\nB");
		Stream<Path>s1=Files.find(
				Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\company"),
				1,
				(p,b)->b.isDirectory(),
				FileVisitOption.FOLLOW_LINKS
				);
		s1.forEach(s->System.out.println(s));
	}
	{
		System.out.println("\n\n\nC");
		Stream<Path>s1=Files.walk(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\company"));
		s1.forEach(s->System.out.println(s));
	}
	{
		System.out.println("\n\n\nD");
		Stream<Path>s1=Files.list(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\company\\emp"));
		s1.forEach(s->System.out.println(s));
	}
}
}
