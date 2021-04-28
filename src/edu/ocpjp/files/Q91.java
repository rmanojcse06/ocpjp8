package edu.ocpjp.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Q91 {
public static void main(String[] args) {
	try {
		List<String> content = Files.readAllLines(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\emp\\employes.txt"));
		content.stream().forEach(line->{
			try {
				Files.write(Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\emp\\alltemp.txt"), line.getBytes(), StandardOpenOption.APPEND);
			}catch(IOException e) {
				System.out.println("Exception-1");
			}
		});
	}catch(IOException e) {
		System.out.println("Exception-2");
	}
}
}
