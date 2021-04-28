package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;

public class Q59 {
public static void main(String[] args) {
	List<String> sx = Arrays.asList("DOC","MPEG","JPEG","XPEG");
	String str = sx.stream().filter(s->s.contains("PEG")).reduce((s,t)->s+t).get();
	System.out.println("Value:: "+str);
}
}
