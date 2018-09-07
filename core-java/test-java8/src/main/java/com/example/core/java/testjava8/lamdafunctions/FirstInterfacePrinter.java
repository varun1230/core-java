package com.example.core.java.testjava8.lamdafunctions;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;

public class FirstInterfacePrinter {
	
	public void print(FirstInterface firstInterface) {
		firstInterface.firstMethod("apple", "banana");
	}
	
	public void secondPring(SecondInterface secondInterface) {
		secondInterface.firstMethod("Varun", "swathi");
	}
	
	public static void main(String[] args) {
		FirstInterfacePrinter print = new FirstInterfacePrinter();
		
		FirstInterface instance = (String param, String param1) -> {System.out.println("This can be passed any where in this class"+param+ param1  );}; 
		
		print.print((String param ,String param1) ->{ System.out.println(" First interface has this param "+param+ " Another param is "+param1); });

		print.print(instance);
		
		List<Document> documents = new ArrayList<Document>();
		AbstractBehaviour<Integer, Document> contestStuff = new AbstractBehaviour<Integer, Document>() {
			@Override
			public synchronized void done(Integer key, List<Document> value) {
				documents.addAll(value);
			}
		};
		
		
		AbstractBehaviour<Integer, Document> contestStuff1 = 
				(key, value) -> {
				synchronized (documents) {
					documents.addAll(value);
				}
				};
		
		
	}
}
