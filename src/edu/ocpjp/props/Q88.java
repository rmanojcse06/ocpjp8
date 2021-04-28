package edu.ocpjp.props;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q88 {
public static void main(String[] args) throws MalformedURLException {
	Locale currLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
//	ClassLoader loader = new URLClassLoader(new URL[] {});
	
	File file = new File("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\props\\");
	URL[] urls = {file.toURI().toURL()};
	ClassLoader loader = new URLClassLoader(urls);
	
	ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", currLocale
			,loader);
	Enumeration<String> names = rb.getKeys();
	while(names.hasMoreElements()) {
		String key  = names.nextElement();
		String name = rb.getString(key);
		System.out.println(key+" = "+name);
	}
}
}
