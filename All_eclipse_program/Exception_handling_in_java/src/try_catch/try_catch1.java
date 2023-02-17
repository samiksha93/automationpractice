package try_catch;
import java.util.Scanner;

public class try_catch1 {

	public static void main(String[] args) {
		
//		Scanner scr1 = new Scanner(System.in);
//		System.out.println("enter a number :");
//		int input1 =scr1.nextInt();
//		
//		try {
//			System.out.println(input1/0);	
//		}catch(Exception e){
//		System.out.println("Nmuber is not divide  :"+e);
//		}	
		
		Scanner scr2 = new Scanner (System.in);
		System.out.println("enter size");
		int input2=scr2.nextInt();
//		try {
//		
//		System.out.println("input is integer");
//		}catch(Exception e) {
//			System.out.println("input is not integer :"+e);
//		}
		int size =input2;
		
		int[] arr1=new int[size];
//		System.out.println(arr1);
		try {
			System.out.println(arr1[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array size is out of index :"+e);
			e.printStackTrace();
		}finally {
			
			System.out.println("///Im final block so so i will definetly executed in any condition ///");
			int x=10/0;
			System.out.println("end of finally block");
		}
		
		
	}

}
