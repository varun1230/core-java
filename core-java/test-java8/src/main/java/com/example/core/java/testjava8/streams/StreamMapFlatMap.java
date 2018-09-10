package com.example.core.java.testjava8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.core.java.testjava8.MethodReference.Employee;

/**
 * 
 * @author  varun
 *
 * Usage : A Stream in java is a sequence of elements supporting parallel and aggregate operations  
 * 
 * */

public class StreamMapFlatMap {
	List genericList =null;
	
	static List<Employee> employeeList = Arrays.asList(
		      new Employee("Tom Jones", 45, 7000.00),
		      new Employee("Harry Major", 25, 10000.00),
		      new Employee("Ethan Hardy", 65, 8000.00),
		      new Employee("Nancy Smith", 22, 12000.00),
		      new Employee("Deborah Sprightly", 29, 9000.00));
	
	public static void main(String[] args) {
		
	//Example of Map	
		System.out.println("Example of Stream Map	 ");	
	List<Double> salaryList = (List<Double>) employeeList.stream().map(e -> e.getSalary()).collect(Collectors.toList());
	salaryList.forEach(System.out::print);
	System.out.println(" ");
	List<String> employeeNameList = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
	
	System.out.println(" Example of stream flat Map	with an object ");
	//Example of flatMap with object 
	List<Employee> employeesList = employeeList.stream().flatMap(e -> { e.setSalary(e.getSalary()+10); return Stream.of(e); }).collect(Collectors.toList());
	employeesList.forEach(System.out::print);		
	System.out.println(" ");
	System.out.println(" Example of stream flat Map	with a string");
	//Example of flat map with String 
	List<String> employeeFirstNameList = employeeNameList.stream().flatMap(name -> Stream.of(name.split(" ")[0])).collect(Collectors.toList());
	employeeFirstNameList.forEach(System.out::print);
	System.out.println(" ");
	//Example of map and flatMap
	System.out.println(" Example of stream map and flat Map	with string ");
	List<String> lastNamelist = employeesList.stream().map(e -> e.getName()).flatMap(name -> Stream.of(name.split(" "))).map(x -> x+" APPEDNED STRIN ").collect(Collectors.toList());
	lastNamelist.forEach(System.out::print);
	System.out.println(" ");
	employeesList.addAll(employeesList);
	
	//Example of filter
	System.out.println(" Example of stream filter	");
	List<Employee> employeegt30 = employeesList.stream().filter(e -> e.getAge()> 30).collect(Collectors.toList());
	employeegt30.forEach(System.out::print);
	
	System.out.println(" ");
	
	//Example of filter find any 
	System.out.println(" Example of stream filter findAny	");
	Optional<Employee> employeegt30FindANy = employeesList.stream().filter(e -> e.getAge()> 30).findAny();
	if(employeegt30FindANy.isPresent()) {
		System.out.println(" Employee find any whose age is greater than 30"+employeegt30FindANy.get().getName());
	}
	
	System.out.println(" ");
	
	//Example of filter all match
	System.out.println(" Example of stream all match ");
	boolean employeegt30Match = employeesList.stream().allMatch(e -> e.getAge()> 30);
	System.out.println(" Employee all match whose age is greater than 30"+employeegt30Match);
	
	
	
	System.out.println(" ");
	//Example of distinct
	System.out.println(" Example of stream distinct	");
	List<Employee> distinctEmployeegt30 = employeegt30.stream().distinct().collect(Collectors.toList());
	distinctEmployeegt30.forEach(System.out::print);
	System.out.println(" ");
	//Example of limit 
	System.out.println(" Example of stream limit ");
	List<Employee> distinctEMployeegt30Bylimit = employeesList.stream().limit(3).collect(Collectors.toList());
	distinctEMployeegt30Bylimit.forEach(System.out::print);
	System.out.println(" ");
	//Example of Skip
	System.out.println(" Example of stream Skip ");
	List<Employee> skipEMployeegt30Bylimit = employeesList.stream().skip(2).collect(Collectors.toList());
	skipEMployeegt30Bylimit.forEach(System.out::print);
	System.out.println(" ");
	//Example of Skip
	System.out.println(" Example of stream reduce by binary operation ");
	
	Optional<Double> totalSal = employeesList.stream().map(e -> e.getSalary()).reduce((a, b)-> a+b);
	if(totalSal.isPresent()){
		System.out.println(" Total salary for all employees is "+totalSal.get());
	}
	
	Optional<Employee> highestPaidEmp = employeesList.stream().reduce((Employee e1, Employee e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2 );
	if(highestPaidEmp.isPresent()) {
		System.out.println(" Highest paid employee is"+highestPaidEmp.get().getName());
	}
	
	System.out.println(" ");
	//Example of Skip
	System.out.println(" Example of stream reduce by identity and binary operation ");
	
	Double totalSalary = employeesList.stream().map(e -> e.getSalary()).reduce(0.00, (a, b)-> a+b);
	System.out.println(" Total salary for all employees is "+totalSalary);
	
	}

}
