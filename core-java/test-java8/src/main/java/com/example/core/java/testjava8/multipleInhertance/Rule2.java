package com.example.core.java.testjava8.multipleInhertance;

/*
 * Rule 2 : Derived interface or sub interface take higher priority  than the interface higher up in the interface hierarchy
 *
 * If default method with same method signature exists in an interface and children interface.
 * Then children interface takes the priority
 */

public class Rule2 implements InterfaceC {
	
	public static void main(String[] args) {
		Rule2 rule2 = new Rule2();
		rule2.defaultMethod();
	}

}
