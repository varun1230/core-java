package com.example.core.java.testjava8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

//Method reference are simplest form of lamda functions

public class StaticMethodReference {

	public static void main(String[] args) {
		//Static method reference 
		Function<String, Double> doubleCOnvertor = Double::parseDouble;
		Function<String, Double> lambdaDoubleConvertor = (str) -> {return Double.parseDouble(str);};
		
		System.out.println("Using reference variable for String to double convertor"+doubleCOnvertor.apply("123.45"));
		System.out.println(" Using lambda function for conversion"+lambdaDoubleConvertor.apply("1234.454"));
		
		//instance method reference 
		Consumer<String> stringPrinter = System.out::println;
		Consumer<String> lambdaStringPrinter = (String s) -> {System.out.println(s);};
	
		stringPrinter.accept("Printing this string");
		lambdaStringPrinter.accept(" This is the lambda String Consumer");
		
		//Reference to instance method of an arbitary object of particular type
		
		List<Integer> list = Arrays.asList(1, 2,3, 4,5);
		BiPredicate<List<Integer>, Integer> refernceInstantiate = List::contains;
		BiPredicate<List<Integer>, Integer> lambdaReferenceInstantiate = (List<Integer> listInt,Integer val) -> { return listInt.contains(val);};
		
		System.out.println(" Is 2 part of list "+ refernceInstantiate.test(list, 2));
		System.out.println(" Is 3 part of list "+ lambdaReferenceInstantiate.test(list, 3));

	
	}
	
	

}
