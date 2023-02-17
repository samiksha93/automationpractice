package Inheritance;

class A{
	//java compiler will write default constructor
	
	static int a=10; // static variable 
	int b =99;  // non static variable
	double c =34.8; // non static variable
	
}
class B extends A{
	//java compiler will write default constructor with default super() statement
	
	static int x= 20;
	int b = 100;
	double z =35.8;
	
}
class C extends B{
	//java compiler will write default constructor with default super() statement
	
	static int p=30;
	int b = 101;
	double r =36.8;
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		/****************** Access static member  *********************/
		System.out.println("Class A static variable: "+A.a);
		System.out.println("Class B static variable: "+B.x);
		System.out.println("Class C static variable: "+C.p);
		
		System.out.println("*****************************");
		
		/****************** Access non static member*********************/
		
		A a1 =new A();
		System.out.println("Class A non static variable: "+a1.b);
		System.out.println("Class A non static variable: "+a1.c);
		
		System.out.println("*****************************");
		
		B x1 =new B();
//		System.out.println("Class B non static variable: "+x1.y);
		System.out.println("Class B non static variable: "+x1.z);
		
		System.out.println("*****************************");
		
		C p1 =new C();
//		System.out.println("Class C non static variable: "+p1.q);
		System.out.println("Class C non static variable: "+p1.r);
		
		System.out.println("*****************************");
		
		C Inherit_object =new C();
		System.out.println("Inherit class A in class C print b: "+Inherit_object.b);
		System.out.println("Inherit class B in class C: "+Inherit_object.z);
		
	}

}
