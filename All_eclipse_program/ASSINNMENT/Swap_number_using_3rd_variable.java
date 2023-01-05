package ASSINNMENT;

import java.util.Scanner;

public class Swap_number_using_3rd_variable {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number x:");
		int x=input.nextInt();
		System.err.println("Enter a number y:");
		int y= input.nextInt();
		
		System.err.println("before swap number is: "+ x+y);
		int swap;
		swap =x;     //swap=x=10
		x=y;		//x=y=20 ,means  x=20			
		y=swap;		// y =swap=10   y=10
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("swap number is :"+x+y);
			
		

	}

}
