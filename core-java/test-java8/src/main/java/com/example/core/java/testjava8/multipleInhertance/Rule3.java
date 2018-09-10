package com.example.core.java.testjava8.multipleInhertance;

/*
 * Rule 3 : In case Rule1 and Rule2 are not able to resolve the conflict then the implementing 
 * class has to specifally overide and provide method with same method definition 
 * 
 *  
 */

public class Rule3 implements InterfaceA, InterfaceB {

	@Override
	public void defaultMethod() {
		InterfaceA.super.defaultMethod();
	}

}
