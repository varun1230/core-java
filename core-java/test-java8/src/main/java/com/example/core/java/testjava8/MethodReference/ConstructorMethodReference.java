package com.example.core.java.testjava8.MethodReference;

import java.util.function.Supplier;

/*
 
 
 */

public class ConstructorMethodReference {

	public static void main(String[] args) {
		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee("Swathi", 10000);
		
		System.out.println(" Employee is name "+emp.name+" value is "+emp.age);
//		Supplier<Integer> supInt = Integer::new;
		
	}

	
}
