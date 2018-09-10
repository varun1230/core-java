package com.example.core.java.testjava8.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.core.java.testjava8.MethodReference.Employee;

public class UsageOfCollection {
	static Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();
	
	
	public static void main(String[] args) {
		 List<Employee> list2014 = Arrays.asList(
			        new Employee("Deborah Sprightly", 29, 9000.00));
			    employeeDOJMap.put(2014, list2014);
			    List<Employee> list2015 = Arrays.asList(
			        new Employee("Tom Jones", 45, 7000.00),
			        new Employee("Harry Major", 25, 10000.00));
			    employeeDOJMap.put(2015, list2015);
			    List<Employee> list2016 = Arrays.asList(
			        new Employee("Ethan Hardy", 65, 8000.00),
			        new Employee("Nancy Smith", 22, 12000.00));
			    employeeDOJMap.put(2016, list2016);
	
	
		//Example of foreach internal iterator	    
		System.out.println(" Example of foreach internal iterator ");  
		
		
		employeeDOJMap.forEach((year, empList) -> System.out.println(year+"---"+employeeDOJMap));
		
		
		System.out.println(" ");
	
		System.out.println(" Example of collection replace all ");
		
		employeeDOJMap.replaceAll((year, empList) -> {
			empList.replaceAll(e -> {
				
				e.getName().toUpperCase();
				return e;
			});
			return empList;
		}) ;
		
		employeeDOJMap.forEach((year, empList) -> System.out.println(year+"---"+employeeDOJMap));
		
		System.out.println(" ");
		
		System.out.println(" Example of collection ComputeIfAbsent ");

		employeeDOJMap.computeIfAbsent(2017,emplist ->new ArrayList<Employee>()).add(new Employee("Varun D", 30, 10000.0)); 	
		
		employeeDOJMap.forEach((year, empList) -> System.out.println(year+"---"+employeeDOJMap));

		
		System.out.println(" ");
		
		System.out.println(" Example of collection ComputeIfPresent removeIf");
		
		employeeDOJMap.computeIfPresent(2014, (year, empList) -> empList.removeIf( e -> e.getName().equals("Deborah Sprightly")) && empList.size() == 0 ? null : empList );

		
		employeeDOJMap.forEach((year, empList) -> System.out.println(year+"---"+employeeDOJMap));
		
		System.out.println(" ");
		
		System.out.println(" Example of collection Sort for sorting salaries from higher to lower for year 2016 ");
		
		List<Employee> empLi = employeeDOJMap.get(2014);
		
		empLi.sort((Employee e1, Employee e2) -> Double.compare(e1.getSalary(), e2.getSalary())); 
		empLi.forEach(System.out::print);
		
	}
}
