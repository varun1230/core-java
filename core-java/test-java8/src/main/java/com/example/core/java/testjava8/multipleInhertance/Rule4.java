package com.example.core.java.testjava8.multipleInhertance;

/*
 * Rule 4 - Diamond rule 
 * 
 * Diamond problem where in grand child has both of its parents inheriting from single grand parent class,
 * is a common problem faced in languages with multiple inheritance. Java 8 is affected by the problem in 2 ways 2 scenarios  
 */


public class Rule4 implements InterfaceE, InterfaceD {

	@Override
	public void defaultMethod(){
//		InterfaceE.super.defaultMethod();
		System.out.println(" Default method from Rule 4");
	}
	
	public static void main(String[] args) {
		Rule4 rule4 = new Rule4();
		rule4.defaultMethod();
	}
	
}
