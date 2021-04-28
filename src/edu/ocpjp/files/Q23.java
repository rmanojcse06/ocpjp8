package edu.ocpjp.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q23 {
public static void main(String[] args) {
	Path source = Paths.get("../edu.ocpjp.ws/resources/data/december/log.txt");
	Path destination = Paths.get("../edu.ocpjp.ws/resources/data/log.txt                                                                                   vbbv vbbv v bbbbbb b b");
	try{
		Files.copy(source, destination);
	}catch(Throwable t) {
		t.printStackTrace();
	}
}
}
