package com.example.core.java.testjava8.filteredExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleSolution {

	public static void main(String[] args) throws Exception {
		
		String thisLine = null;
		
		System.out.println("Enter your input");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i1 =0;
		String ip = "";
		int op = 0;
				
		while(!(thisLine = br.readLine()).isEmpty()) {
			System.out.println("Imput is "+thisLine);
			if(i1 == 0) {
				System.out.println("First input gone to i1");
				ip = thisLine;	
			} else if (i1 == 1) {
				System.out.println("Second input gone to op");
				op = Integer.parseInt(thisLine);
			}
				i1++;
		}
		
		String[] str = ip.split(" ");
		int len = str.length;
		int[] b = new int[len];
		
		for (int i = 0; i < len; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		String[] output = new String[2];
		
		int k =0;
		
		if(len > 1) {
			for (int i = (len-1); i >= 0 ; i--) {
				for (int j = (i-1); j >= 0; j--) {
					System.out.println("b[i]+b[j]"+b[i]+b[j]);
					if(op == (b[i]+b[j])) {
						output[k] = b[j] + " "+b[i];
						k++;
					}
				}
			}
			
			for(int i = output.length -1 ; i>=0; i-- ) {
				System.out.print(output[i]);
			}
		}
		
	}
	
}
