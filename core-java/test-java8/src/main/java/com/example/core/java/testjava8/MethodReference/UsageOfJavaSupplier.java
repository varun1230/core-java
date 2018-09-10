package com.example.core.java.testjava8.MethodReference;

import java.util.function.Supplier;

/*
 * Usage : Represents a supplier of a result
 * 
 * Using supplier functional interface can be used with 
 * Lambda expression or method reference or consturtor reference
 * 
 */
		

public class UsageOfJavaSupplier {

	
	public static void main(String[] args) {
		Supplier<Integer> supInt = () -> {return 10;};

		System.out.println("Using lamda expression "+supInt.get());
	
		Supplier<Integer> intStringVal = UsageOfJavaSupplier::getIntVal;

		//Using supplier using static method reference 
		System.out.println(" Using static method reference "+intStringVal.get());
	
	}

	public static Integer getIntVal() {
		return new Integer("100");
		
	}
	
}
