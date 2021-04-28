package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q109 {
public static void main(String[] args) {
	Stream<List<String>>s1=Stream.of(Arrays.asList("text1","text2"),Arrays.asList("text2","text3"));
	Stream<String>s2=s1.filter(s->s.contains("text1"))
						.flatMap(rs->rs.stream());
	s2.forEach(b->System.out.println("---- b="+b));
}
}
