package com.example.core.java.testjava8.compartor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.example.core.java.testjava8.MethodReference.Employee;

public class ComparatorOldWay {

	static List<Employee> employeeList = 
		      Arrays.asList(new Employee("Tom Jones", 45), 
		        new Employee("Harry Major", 35),
		        new Employee("Harry Major", 25), 
		        new Employee("Ethan Hardy", 65), 
		        new Employee("Nancy Smith", 15),
		        new Employee("Deborah Sprightly", 29));
	 
	 public static void main(String[] args) {
		Collections.sort(employeeList, new EmployeeComparatorBeforeJava8());
		employeeList.forEach(System.out::println);
	 }
	
}
