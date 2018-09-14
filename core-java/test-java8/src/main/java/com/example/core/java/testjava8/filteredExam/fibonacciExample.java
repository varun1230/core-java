package com.example.core.java.testjava8.filteredExam;

import java.util.Scanner;

public class fibonacciExample {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Type the number for fibonacci" );
		
		int number = sc.nextInt();
		
		for (int i = 1; i <=number; i++) {
			System.out.println(" "+fibonacci2(i));
		}
	
	}
	
	public static int fibnacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		
		return fibnacci(number -1)+fibnacci(number -2);
	}
	
	public static int fibonacci2(int number) {
		
		if(number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 2, fibonacci=1;
		
		
		for(int i =3; i<=number; i++) {
			fibonacci = fibo1+fibo2;
			fibo1 = fibo2;
			fibo2 =fibonacci;
		}
		
		return fibonacci;
	}
}
