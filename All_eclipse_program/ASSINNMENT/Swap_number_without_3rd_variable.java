package ASSINNMENT;

import java.util.Scanner;

public class Swap_number_without_3rd_variable {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number x:");
		int x=input.nextInt();
		System.out.println("Enter a number y:");
		int y= input.nextInt();
		
		System.out.println("before swap number is: "+ x+y);
		
		x = x + y;
	      y = x - y;
	      x = x - y;
		
		System.out.println("after swap number is :" +x+y);

	}

}
