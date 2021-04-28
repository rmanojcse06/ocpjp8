package edu.ocpjp.props;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q139 {
public static void main(String[] args) throws Exception{
	File file = new File("D:\\31644374\\05-workspaces\\OCPJP\\edu.ocpjp.ws\\resources\\msg");
	URL[] urls = {file.toURI().toURL()};
	ClassLoader loader = new URLClassLoader(urls);

	
	Locale currentLocale = null;
	try{
		System.out.println("A");
		currentLocale=new Locale("de","DE");
	    ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle",currentLocale,loader);
		System.out.println(rb.getString("inquiry"));
	}catch(Throwable t) {
		t.printStackTrace();
	}
	try{
		System.out.println("\n\n\nB");
		currentLocale=new Locale.Builder().setLanguage("de").setRegion("DE").build();
	    ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle",currentLocale,loader);
		System.out.println(rb.getString("inquiry"));
	}catch(Throwable t) {
		t.printStackTrace();
	}
	try{
		System.out.println("\n\n\nC");
		currentLocale=Locale.GERMAN;
	    ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle",currentLocale,loader);
		System.out.println(rb.getString("inquiry"));
	}catch(Throwable t) {
		t.printStackTrace();
	}
	{
//		System.out.println("\n\n\nD");
//		currentLocale=new Locale();
//		currentLocale.g
//	    ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle",currentLocale);
//		System.out.println(rb.getString("inquiry"));
	}
	try{
		System.out.println("\n\n\nE");
//		currentLocale=Locale.getInstance();
	    ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle",currentLocale,loader);
		System.out.println(rb.getString("inquiry"));
	}catch(Throwable t) {
		t.printStackTrace();
	}    
	
}
}
