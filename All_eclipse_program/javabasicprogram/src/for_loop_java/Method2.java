package for_loop_java;


import javax.swing.plaf.synth.SynthSeparatorUI;

public class Method2 {

	static double x = 10, y = 20, z = 30;

	// static double x,y,z;
	public static void main(String[] args) {
		// x=10;
		// y=20;
		// z=30;
		System.out.println("Input the first number: " + x);
		System.out.println("Input the second number: " + y);
		System.out.println("Input the third number: " + z);
		//System.out.println("The average value is " + Method2.average());
		//average();
		double res=Method2.average();
		System.out.println("Average: "+res);
		
		System.out.println("New Average: "+average(12, 15, 17));
		System.out.println("New Average: "+average(22, 55, 18));
		System.out.println("New Average: "+average(15, 15, 17));
		int p=55,q=58,r=82;
		System.out.println("New Average2: "+average(p,q,r));
		
		addition(25.25, 35);
		
		System.out.println(addition(35, 45));
		
	}
	public static double average(int a,int b,int c) //int a=12,int b=15,int c=17;
													//int a=p=55, b=q=58, c=r=82;
	{
		return (a+b+c)/3;
	}
	public static double average() {
		return (x + y + z) / 3;
	}
	
	public static void addition(double a,double b) {
//		System.out.println("addition method with void return type");
		double res=a+b;
//		System.out.println("addition of "+a+" and "+b+" : "+res);
		
	}
	public static double addition(int a,int b) {
//		System.out.println("addition method with double return type");
		double res=a+b;
//		System.out.println("addition of "+a+" and "+b);
		return res;
	}
	//Addition of two numbers
	//Multiplication of two numbers
	//division of two number
}
