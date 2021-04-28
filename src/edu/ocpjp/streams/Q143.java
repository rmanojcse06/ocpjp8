package edu.ocpjp.streams;

import java.util.stream.Stream;

public class Q143 {
public static void main(String[] args) {
	System.out.println("\n\n\n FINDANY------");
	Stream.of("Java","Unix","Linux")
	.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK::"+s))
	.findAny();
	
	System.out.println("\n\n\n FINDFIRST------");
	Stream.of("Java","Unix","Linux")
		.filter(s->s.contains("n"))
			.peek(s->System.out.println("PEEK::"+s))
		.findFirst();
	
	
	System.out.println("\n\n\n ANYMATCH------");
	Stream.of("Java","Unix","Linux")
	.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK::"+s))
	.anyMatch(s->s.contains("n"));
	
	
	System.out.println("\n\n\n ALLMATCH------");
	Stream.of("Java","Unix","Linux")
	.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK::"+s))
	.allMatch(s->s.contains("n"));
	
	
	System.out.println("\n\n\n NONEMATCH------");
	Stream.of("Java","Unix","Linux")
	.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK::"+s))
	.noneMatch(s->s.contains("Java")||s.contains("Linux"));
	
	
}
}
