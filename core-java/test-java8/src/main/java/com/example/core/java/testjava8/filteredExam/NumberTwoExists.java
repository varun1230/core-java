package com.example.core.java.testjava8.filteredExam;

import java.util.Scanner;

public class NumberTwoExists {

	public static String currentState = "N";
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			if(String.valueOf(i).contains("2")) {
				System.out.println("Integer "+i+" contains number 2");
			}
		}
		
		
		boolean exit = false;
		
		do {
			System.out.println(" Enter number to see if 2 exist in the number");

			int val = sc.nextInt();
			
			if(String.valueOf(val).contains("2")) {
				System.out.println("Your String contains 2");
			} else {
				System.out.println("Your String does not have number 2");
			}
			
			System.out.println(" Do you want to continue ");
		
			System.out.println(" Press Y to continue and N to exit");
			currentState = sc.next();
			
			if(currentState.equalsIgnoreCase("N")) {
				exit = true;
			}
		} while (!exit);
		System.out.println("Exiting the program");
	}
}
