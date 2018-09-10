package com.example.core.java.testjava8.multipleInhertance;

import com.sun.javafx.css.Rule;

/*
 * Rule : 1
 * Conflict resolution rules for inherited defaultMethods 
 * 
 * Class takes higher precedence than interfaces 
 * 
 * Any method inherited from a class or superclass is invoked over any default method 
 * inherited from interface
 */

public class Rule1 extends ClassC  implements InterfaceA, InterfaceB {

	public static void  main(String args[] ) {
		Rule1 rule1 = new Rule1();
		rule1.defaultMethod();
	}
	
}
