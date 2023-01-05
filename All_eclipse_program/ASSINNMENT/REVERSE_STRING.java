package ASSINNMENT;

import java.util.Scanner;

public class REVERSE_STRING {

	public static void main(String[] args) {

//		String str1="NOTEBOOK";
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String :");
	        String str = sc.nextLine();   //Input the string
	        //Call a recursive function to reverse the string
//	        System.out.println(str.substring(1)+str.charAt(0));
//	        System.out.println(str.charAt(0));
//	        reverseString(str);
	      // reverse character one by one 
		int len=str.length();
		String temp="";
		for (int i=len-1;i>=0;i--) {
//			System.out.println(str.charAt(i));

			temp= temp+str.charAt(i);
			
		} System.out.println("The reverse of the entered the String :"+temp);
		
//		 reverse whole statement one by one string
		
	}

}
