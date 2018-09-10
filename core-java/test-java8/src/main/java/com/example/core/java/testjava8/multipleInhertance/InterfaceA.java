package com.example.core.java.testjava8.multipleInhertance;

public interface InterfaceA {
	public default void defaultMethod() {
		System.out.println("Calling from interfaceA defaultMethod");
	}
}
