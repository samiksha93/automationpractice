package ASSINNMENT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Assignment:3 --> Find duplicate character in string and count no. of duplicate character
 */

public class Find_duplicate_char_count {

	public static void main(String[] args) {
		// create scanner class instance to take input from user
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter string to find duplicate character: ");
		// use nextLine() method 
		String s1= scr.nextLine();
		//print length of the string
		System.out.println(s1.length());
		//change string in lower case
		s1 = s1.toLowerCase();
		
		int[] char1 =new int[128];
		
		
		for (int i=0; i<s1.length();i++) {
			char c = s1.charAt(i);//s
			char1[c]++; 
		}
	    System.out.println("Duplicate characters and their count in the string:");
	    for (int i = 0; i < char1.length; i++) {
	      if (char1[i] > 1) {
	        System.out.println((char)i + ": " + char1[i]);
	      }
	    }
	  }
	}