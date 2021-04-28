package edu.ocpjp.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q153 {
public static void main(String[] args) {
	IntStream s=Stream.of(1,2,3,4).flatMapToInt(a->IntStream.of(a));
	System.out.println("dVal-"+s.average().getAsDouble());
}
}
