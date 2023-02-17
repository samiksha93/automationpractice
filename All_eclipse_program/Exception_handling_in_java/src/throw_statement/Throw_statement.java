package throw_statement;

import java.util.Scanner;

public class Throw_statement {

	public static void vote_throw(int age)   {
		if (age<18) {
		throw new ArithmeticException("you are not eligible for voting");}
		else {
			System.out.println("you are  eligible for voting");
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		Scanner scr1 =new Scanner(System.in);
		System.out.println("enter your age:");
		int age1=scr1.nextInt();
		vote_throw(age1);
		           
//		try {
//		vote_throw(age1);}
//		catch (Exception e){
//		System.out.println("execption :"+e);
//	}
		System.out.println("rest of the code ");
			
		}
		
	}
