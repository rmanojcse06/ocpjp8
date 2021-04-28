package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q11 {
public static void main(String[] args) {
	Stream<List<String>> iStr = Stream.of(
				Arrays.asList("1","John"),
				Arrays.asList("2",null)
			);
	IntStream intStream = iStr.flatMapToInt(b->IntStream.of(b.size()));
	intStream.forEach(System.out::println);
}
}
