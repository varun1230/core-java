package com.example.core.java.testjava8.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Usage of consumer : Represents an operation that accepts a single input argument and returns no result
 * 
 * Is used in all contexts in where an object needs to be consumed i.e taken as input and some 
 * operation is performed on the object without returning any result.
 * 
 *  Since consumer is a functional interface, hence it can be used as assignement target for lambda expression or a method reference
 */
		
		

public class UsageOfJavaConsumer {

	public static void main(String[] args) {
	
		Consumer<Integer> consumerInt = (Integer i) -> System.out.print(" ("+i);
		Consumer<Integer> consumerAndThen = consumerInt.andThen(i -> System.out.print(" Printed After"+i+")"));
		
		
		consumerAndThen.andThen(consumerAndThen).andThen(consumerInt).andThen(consumerInt).andThen(consumerAndThen).accept(100);
		
		List<Integer> listInteger = Arrays.asList(new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5));
		
		printList(listInteger, consumerAndThen);
	
	}
	
	public static void printList(List<Integer> listInteger, Consumer<Integer> consumerThen) {
		for (Integer intVal : listInteger) {
			consumerThen.accept(intVal);
		}
	}
	
	
}
