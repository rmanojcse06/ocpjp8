package edu.ocpjp.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q20 {
	public static void main(String[] args) {
		Path p = Paths.get("/Pics/MyPic");
		System.out.println(p.getNameCount()+":"+p.getName(1)+":"+p.getFileName());
		
		try {
		Files
			.readAllLines(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\a.txt"))
				.stream()
					.filter(s->s.toString().contains("AC"))
						.forEach(System.out::println);
			
		}catch(Throwable t) {
			t.printStackTrace();
		}
		
	}
}
