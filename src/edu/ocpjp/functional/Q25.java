package edu.ocpjp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String>{
	@Override
	public default boolean test(String t) {
		return t.equals("Java");
	}
}

public class Q25 {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Java","Java EE","Java ME","Japan");
	Predicate<String> cf1 = s->s.length() > 3;
	Predicate cf2 = new CourseFilter() {
		public boolean test(String t){
			return t.contains("Java");
		};
	};
	Predicate<String> cf3 = s->s.startsWith("Ja");
	
	long c =list.stream().filter(cf1).peek(t->{System.out.println("cf1::"+t);})
				.filter(cf2).peek(t->{System.out.println("cf2::"+t);})
				.filter(cf3).peek(t->{System.out.println("cf3::"+t);})
				.count();
	System.out.println("count := "+c);
}
}
