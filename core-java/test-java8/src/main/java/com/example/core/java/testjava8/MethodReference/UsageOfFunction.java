package com.example.core.java.testjava8.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * @author varun
 *
 * Usage of function : Represents a function that accepts one argument and produce a result 
 * 
 * 
 * Function <T, R> is a build in function interface in java 8 . The primary purpose for creating is mapping scenario. 
 * i.e when object of type is taken and converted to another type   
 *
 *
 *
 */
public class UsageOfFunction {

	public static void main(String[] args) {
		Function<Employee, String> funOperation = (e) -> e.name;
		List<Employee> list = Arrays.asList(new Employee("One val", 10), new Employee("Two val", 20), new Employee("Three val", 20), new Employee("Four val", 40));
		
		Predicate<Integer> predOper = (i) -> i > 10;
		
		//Usage of predicate and apply 
		printList(list, funOperation, predOper);		
		
		//usage of andThen 
		
		Function<String, String> andThenFun = (String name) -> {
			int index = name.indexOf(" ");
			String finalName = name.substring(0);
			return finalName;
		};
		
		List<String> anThenList = printAndThenList(list, funOperation.andThen(andThenFun));
		anThenList.forEach(System.out::print);
		
		
		//Usage of compose in function 
		
		Function<Employee, Employee> composeFun = (e) -> {
			int index = e.name.indexOf(" ");
			String newName = e.name.substring(0, index);
			e.setName(newName);
			return e;
		};
		List<String> composeList = printComposeList(list, funOperation.compose(composeFun));
		composeList.forEach(System.out::print);
		
		//Usage of Identify in function 
		
		List<Employee> eList = printIdentityList(list, Function.identity());
		eList.forEach(System.out::println);
	}

	public static void printList(List<Employee> eList, Function<Employee, String> funOperation , Predicate<Integer> predCondition ){
		for (Employee employee : eList) {
			if(predCondition.test(employee.age)) {
				System.out.println(" Using java 8 Function bringing the name "+funOperation.apply(employee));

			
			}
		}
	}
	

	public static List<String> printAndThenList(List<Employee> eList, Function<Employee, String> anThenFun) {
		List<String> list = new ArrayList<String>();
		
		for (Employee e : eList) {
			String s = anThenFun.apply(e);
			list.add(s);
		}
		
		return list;
	}

	public static List<String> printComposeList(List<Employee> eList, Function<Employee, String> conposeFun) {
		List<String> list = new ArrayList<String>();
		
		for (Employee e : eList) {
			String s =conposeFun.apply(e);
			list.add(s);
		}
		return list;
	}

	public static List<Employee> printIdentityList(List<Employee> eList, Function<Employee, Employee> identityFun) {
		List<Employee> list = new ArrayList<Employee>();
		
		for (Employee employee : eList) {
			Employee e = identityFun.apply(employee);
			list.add(e);
		}
		return list;
	}
}
