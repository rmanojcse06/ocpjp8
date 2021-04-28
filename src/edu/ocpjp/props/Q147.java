package edu.ocpjp.props;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q147 {
public static void main(String[] args) throws Throwable{
	(new Q147()).loadResourceBundle();
}
public void loadResourceBundle() throws Throwable{
	File file = new File("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\msg");
	URL[] urls = {file.toURI().toURL()};
	ClassLoader loader = new URLClassLoader(urls);
	ResourceBundle res=ResourceBundle.getBundle("Greetings", Locale.US, loader);
	System.out.println("greetings=>"+res.getObject("HELLO_MSG"));
}
}
