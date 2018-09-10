package com.example.core.java.testjava8.staticdefaultInterfaceMethods;

public class DefaultImp implements InterfaceWithStaticAndDefault{
	
	public static void main(String args[] ) {
		
		DefaultImp impl = new DefaultImp();
		System.out.println("Code getting from"+impl.defaultMethod("Calling from DefaulyImpl class"));
		
		System.out.println("Code getting from "+InterfaceWithStaticAndDefault.staticMethod("Calling from DefaultImpl class"));
	}

}
