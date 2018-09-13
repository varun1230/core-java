package com.example.core.java.testjava8.filteredExam;


import java.util.Scanner;
public class ReverseANumber {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter the number to reversed");
		
		
		int number = sc.nextInt();
		
		System.out.println("Reverse number is "+reverse(number));
		
		System.out.println("float val"+(float)12349/10);
	}
	
	
	public static int reverse(int number) {
		
		int reverse = 0;
		int remainder = 0;
		
		
		do {
			
			remainder = number % 10;
			System.out.println("remainder is"+remainder);
			reverse = reverse*10+remainder;
			System.out.println("Reverse is"+reverse);
			number = number/10;
			System.out.println("Number is"+number);
			
		} while(number > 0);
		
		return reverse;
	}
}
