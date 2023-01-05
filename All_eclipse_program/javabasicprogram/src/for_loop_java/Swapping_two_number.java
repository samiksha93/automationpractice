package for_loop_java;

public class Swapping_two_number {

	public static void main(String[] args) {
		
// swapping of two number using third variable 
		int num1=50,num2=80;
		int temp=num1;
		
		num1=num2;

		num2=temp;
		
		//System.out.println("num1 = "+num1);
		//System.out.println("num2 = "+num2);
	


//swapping of two number without using third variable		
		int num3=60,num4=30;
		int num5=num3+num4;
		num3=num5-num3;
		num4=num5-num4;
		System.out.println("num3 = "+num3);
		System.out.println("num4 = "+num4);
	}

}
