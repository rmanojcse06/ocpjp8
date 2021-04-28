package edu.ocpjp.props;

import java.text.NumberFormat;
import java.util.Locale;

public class Q108 {
public static void main(String[] args) {
	double d=15;
	Locale l=new Locale("en","US");
	l=new Locale("de","GE");
	NumberFormat f=NumberFormat.getCurrencyInstance(l);
	System.out.println(f.format(d));
}
}
