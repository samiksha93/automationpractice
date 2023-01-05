package ifelse;

public class CheckEvenOddNo {

	public static void main(String[] args) {
	int a=37 ,b=69;
	if (a%2==0 && b%2==0) {
		System.out.println("both are  even number is  "+a+" "+b);
	}
	else if (a%2==0 && b%2!=0) {
		System.out.println("a is  even number "+a);
	}
	else if (a%2!=0 && b%2==0) {
		System.out.println(" b is even number  "+b);
	}
	
		else 	{
			System.out.println(" both are odd number" +a+" "+b);
		}
		
	} 

}



