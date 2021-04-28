package edu.ocpjp.props;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.ResourceBundle;

public class Q62 {
public static void main(String[] args) throws Throwable {
	Locale.setDefault(Category.FORMAT, Locale.GERMAN);
	Locale l = Locale.getDefault();
	
	
	File file = new File("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\msg");
	URL[] urls = {file.toURI().toURL()};
	ClassLoader loader = new URLClassLoader(urls);
	
	
	
	ResourceBundle rb = ResourceBundle.getBundle("Oiler",l,loader);
	for(String s : rb.keySet()) {
		System.out.println("  "+s+"  => "+rb.getObject(s));
	}
}
}
