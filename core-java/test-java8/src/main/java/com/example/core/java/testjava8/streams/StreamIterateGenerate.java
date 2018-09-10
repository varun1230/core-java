package com.example.core.java.testjava8.streams;

import java.util.stream.Stream;

public class StreamIterateGenerate {
	public static void main(String[] args) {
		System.out.println("Stream iterate");
		Stream.iterate(2.0, (Double n) -> n*n).peek((num) -> System.out.println("Num value is "+num) ) .limit(64).forEach(System.out::println);
		System.out.println("Stream generate");
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
	}
}
