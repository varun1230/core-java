package com.example.core.java.testjava8.MethodReference;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8733288810204750177L;
	String name;
	Integer age;
	Double salary;
	
	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name "+this.name+" Age "+this.age+" Salary "+this.salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.equals(obj)){
			return true;
		}
		
		if(!(obj instanceof Employee)) {
			return false;
		}
		
		Employee emp = (Employee) obj;
		return this.age==emp.age && this.salary==emp.salary && this.name.equals(emp.name);
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash*19 + this.age;
		hash = hash*17 + this.salary.hashCode();
		hash = hash* 16 + this.name.hashCode();
		return hash;
	}
	
}
