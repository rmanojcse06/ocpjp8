package edu.ocpjp.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q77 {
public static void main(String[] args) {
	try {
	Path src=Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\green.txt");
	Path des=Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\colors\\yellow.txt");
	Files.move(src, des, StandardCopyOption.ATOMIC_MOVE);
	Files.delete(src);
	}catch(Throwable t) {t.printStackTrace();}
}
}
