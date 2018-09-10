package com.example.core.java.testjava8.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.sun.javafx.image.impl.IntArgb;

/**
 * 
 * 
 * @author  varun
 * Predicate usage : Predicate is a new functional interface defined in java.util.function package which can be used in all context where an object needs to be evaluated for given test condition 
 * and boolean value needs to be returned based on whether the condition was successfully met or not 
 * 
 * Since predicate if functional interface, hence it can be used as assignment target as lambda function or method reference
 *
 */

public class UsageOfPredicate {

	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = (i) -> i%2==0;
		List<Integer> listInt = Arrays.asList(new Integer(11), new Integer(10), new Integer(20), new Integer(-10));
		
		List<Integer> filteredList = filteredList(listInt, evenPredicate);
		filteredList.forEach(System.out::print);
	}

	public static List<Integer> filteredList(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> intList = new ArrayList<Integer>();
		
		Predicate<Integer> nonNegative = (i) -> i>0;
		
		for (Integer integer : list) {
			if(predicate.and(nonNegative).test(integer)){
				intList.add(integer);
			}
		}
		return intList;
	}
	
}
