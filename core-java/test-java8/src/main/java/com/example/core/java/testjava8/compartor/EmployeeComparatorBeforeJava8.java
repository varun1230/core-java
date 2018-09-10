package com.example.core.java.testjava8.compartor;

import java.util.Comparator;

import com.example.core.java.testjava8.MethodReference.Employee;

public class EmployeeComparatorBeforeJava8 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o1.getName());
	}

}
