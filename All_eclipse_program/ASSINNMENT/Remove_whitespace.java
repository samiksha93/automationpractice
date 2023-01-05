package ASSINNMENT;

import java.util.Scanner;

//Assignment = remove white space from string
public class Remove_whitespace {

	public static void main(String[] args) {
		String str = "  Acceleration is a software testing class ";
		
        //1. remove spaces in the string using built-in replaceAll method 
        str = str.replaceAll("\\s", "");
        System.out.println(str);

        //2. tale input and remove all spaces from stirng 
        Scanner scr = new Scanner(System.in);
        System.out.println("enter string :");

        String input_str = scr.nextLine();
        String remove_spaces= input_str.replaceAll("\\s","");
        System.out.println(remove_spaces);
        
	}

}
