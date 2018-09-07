package com.example.core.java.testjava8.lamdafunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Usage 
 * 
 * You need to create your own functional interface or 
 * pre defined functional interface provided by java . 
 * An interface with only single abstract method is called functional interface(or Single Abstract method interface), 
 * for example: Runnable, callable, ActionListener etc.
 * 
 Pre Java 8: We create anonymous inner classes.
 Post Java 8: You can use lambda expression instead of anonymous inner classes.
 
 
 A lambda expression in Java has these main parts:
Lambda expression only has body and parameter list.
1. No name – function is anonymous so we don’t care about the name
2. Parameter list
3. Body – This is the main part of the function.
4. No return type – The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.
 *
 *
 */
//In funtional interface there can be only one abstract method like runnable and callable
@FunctionalInterface
interface MyFunctionalInterface {
	public String sayHello();
}

@FunctionalInterface
interface MyFunctionInterfaceWithParam {
	public String appendString(String abc);
}

@FunctionalInterface
interface MyFunctionInterfaceWithMultipleParam {
	public int append(int a, int b);
}

public class LambdaExpressionExample {


	public static void main(String[] args) {
		MyFunctionalInterface myf = () -> { return "Hello";};
		System.out.println("Functional Interface usagae is "+myf.sayHello());
	
		String input = "Append Value";
		MyFunctionInterfaceWithParam mfParam = (x) -> { return x+" BY Varun";};
		System.out.println("Functional Interface usage with param is"+mfParam.appendString("Append Value"));
	
		MyFunctionInterfaceWithMultipleParam myfMulParam = (x, y) -> {return x+y; };
		System.out.println("Functional Interface usage with multiple param"+myfMulParam.append(1, 3));
	
		//Lambda function in foreach loop 
		
		List<String> a = new ArrayList<String>();
		a.add("abc");
		a.add("Swathi");
		a.add("varun");
		a.add("Simha");
		
		a.forEach( (x) -> {System.out.println(x);});
		
		
		//Example of lambda function usage in Map 
		
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);

		prices.forEach((k, v) -> { System.out.println(" Key is "+k+"And  value "+v);} );

		prices.compute("Grapes", (k, v) -> (v == 40) ? 100: v+10 );
		
		
//		prices.computeIfAbsent("Varun", new Has())
		
//		 map.computeIfAbsent(key, k -> new Value(f(k)));

//		 map.computeIfAbsent(key, k -> new HashSet<V>()).add(v);

//		 map.compute(key, (k, v) -> (v == null) ? msg : v.concat(msg))
		/*
		 * Old Way is 
		 */
		for (String string : prices.keySet()) {
			System.out.println("Key is "+string+" And Value is "+prices.get(string));
		}
		
	}
	
}
