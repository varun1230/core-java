package com.example.core.java.testjava8.filteredExam;


import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class StringReverse {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		
		System.out.println("Enter the sentence you would like to reverse the words ");
		
		String s = sc.nextLine();
		
	   String reverseString =	reverseWords(s);
	   
	   System.out.println("Reversed String is "+reverseString);
	   
	   System.out.println("Using in reverse String "+inPLaceReverseWords(s));
		
	}
	
	public static String inPLaceReverseWords(String sentence) {
		List<String> words = Arrays.asList(sentence.split("\\s"));
		
		Collections.reverse(words);
		
		StringBuffer sb = new StringBuffer();
		
		for (String string : words) {
			sb.append(inPlaceReverse(string));
			sb.append(" ");
		}
		return sb.toString();
		
	}
	
	public static String reverseWords(String sentense) {
		
		List<String> words = Arrays.asList(sentense.split("\\s"));
		
		Collections.reverse(words);
		
		StringBuffer sb = new StringBuffer(sentense.length());
		
		for (int i = 0; i < words.size(); i++) {
			sb.append(reverseString(words.get(i)));
			sb.append(" ");
		}
		
		
		return sb.toString();
	}
	
	
	public static String reverseString(String reverse) {
		
		StringBuffer reverseString = new StringBuffer();
		
		for (int i = reverse.length()-1  ; i >= 0; i--) {
			
			reverseString.append(reverse.charAt(i));
		}
		
		return reverseString.toString();
	}
	
//	Another way to reverse teh String 
	
	
	public static String anotherWayReverse(String line) {
		List<String> lineWords = Arrays.asList(line.split("\\s+"));
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = lineWords.size() - 1 ; i >= 0 ; i--) {
			sb.append(lineWords.get(i));
			sb.append("  ");
		}
		
		return sb.toString();
	}
	
	
	public static String inPlaceReverse(final String input) {
        final StringBuffer builder = new StringBuffer(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }

        return builder.toString();
    }



	
}
