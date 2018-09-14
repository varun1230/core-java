package com.example.core.java.testjava8.filteredExam;

import java.util.Scanner;

/*
 * check to see if N power 2 where N is power of 2 
 * 
 * example 4 is a power of 2 and 0.5 is a power of 2 as 2 power of negative 1
 * 
 * if power of 2 return 1 else 0 
 * 
 * So for input 4 return 1 where as input 5 return 0
 * 1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768
 */

public class IsANumberPowerOf2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do{
			System.out.println("Enter number to check to see if it is a power of 2");
			
			Double val = sc.nextDouble();
			
			System.out.println("Is powerof 2 "+powerOf2(val));
			
			System.out.println("To Continue type Y");
		} while(sc.next().equalsIgnoreCase("Y"));
	}
	
	private static int powerOf2(Double val) {
		
		if(val == 0) {
			return 0;
		} else if(val == 1) {
			return 1;
		}
		
		if(val < 1) {
		Double newVal=multiplyBy2(val);
			//Processs differently
		System.out.println(" New value is "+newVal);
			if(newVal == 1) {
				return 1;
			} else {
				return 0;
			}
		}
		
		if(!(val%2 == 0)) {
			return 0;
		} else {
			for (int i = 0; i < val; i++) {
				if(Math.pow(2, i) == val) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static Double multiplyBy2(Double val) {
		val = val*2;
		System.out.println("multiply by 2"+val);
		if(val < 1) {
			val = multiplyBy2(val);
		} 
		return val;
	}
	
}
