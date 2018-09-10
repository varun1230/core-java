package com.example.core.java.testjava8.multipleInhertance;

public interface InterfaceC extends InterfaceB{

	public default void defaultMethod() {
		System.out.println("Default method from InterfaceC");
	}
	
}
