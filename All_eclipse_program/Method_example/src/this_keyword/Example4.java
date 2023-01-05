package this_keyword;
 


class A {
	int age;
	double salary;
	A(){
		this(10);
		System.out.println("hiii this is class A first constructor");
	}
	A(int b){
		this(20.39);
		System.out.println("hii this is class A seocnd constructor");
	
	}
	A(double c){
		System.out.println("hii this is class A third constructor");
	
	}
}



public class Example4 {

	public static void main(String[] args) {
		A obj1= new A();
		A obj2 = new A(10);
		A obj3 = new A(20.39);
		
	}

}
