package com.example.core.java.testjava8.multipleInhertance;

public interface InterfaceD extends InterfaceB{
	public default void defaultMethod(){
		System.out.println("Default method executed from  InterfaceD");
	}
}
