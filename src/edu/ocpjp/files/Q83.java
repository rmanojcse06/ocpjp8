package edu.ocpjp.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q83 {
public static void main(String[] args) {
	Path p1 = Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\app\\.\\sys\\");
	Path r1 = p1.resolve("log");
	Path p2 = Paths.get("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\server\\exe\\");
	Path r2 = p1.resolve("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\readme\\");
	
	System.out.println("r1="+r1);
	System.out.println("r2="+r2);
}
}
