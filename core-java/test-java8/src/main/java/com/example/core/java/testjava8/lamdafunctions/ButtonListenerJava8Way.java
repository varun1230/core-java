package com.example.core.java.testjava8.lamdafunctions;

import java.awt.Button;
import java.awt.Frame;

public class ButtonListenerJava8Way {

	public static void main(String[] args) {

		Frame f = new Frame("Button Listener Java 8 Way");
		
		Button b = new Button("Click here");
		
		b.setBounds(50 , 100, 80, 50);
		
		b.addActionListener(e -> System.out.println("Hello World"));
		
		f.add(b);
		f.setSize(200, 200);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
