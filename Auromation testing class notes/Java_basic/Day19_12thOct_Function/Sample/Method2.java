package day10.methods;

public class Method2 {

	public static void main(String[] args) {

//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		
//		display();
//		display();
//		display();
//		Method2.display();
//		Method2.display();	
		
		//isEven(25);//method will be executed but you won't be able to use its return value
//		boolean res=isEven(25);
//		System.out.println("result: "+res);
//			//or
		System.out.println("result: "+isEven(20));
		
	}
	
	static void display() {
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
	}
	
	/**
	 * check even odd number
	 */
	static boolean isEven(int num) {
		System.out.println("Given number is: "+num);
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
