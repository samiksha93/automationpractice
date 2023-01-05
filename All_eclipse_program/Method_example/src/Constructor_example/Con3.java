package Constructor_example;



public class Con3 {
	
//	void display() {
//		System.out.println("I am display() of class Cons5.");
	
	
	public static void main(String[] args) {
		
     A c1 =new A ( 34,45.87 );
     c1.display();
     System.out.println(c1.i);

     X c2 = new X();
     c2.display();
     System.out.println(c2.j);

     
	}

}
class A {
	int i = 10;
	A(int a,double b) {
		System.out.println("Running Class A constructor.."+a+"   "+b);
	}
	void display() {
		System.out.println("I am display() of class A.");
	}
}

class X {
	int j =20;
	X(){
		System.out.println("Running class X consturctor..");
	}
	void display() {
		System.out.println("I am display() of classX");
	}
}