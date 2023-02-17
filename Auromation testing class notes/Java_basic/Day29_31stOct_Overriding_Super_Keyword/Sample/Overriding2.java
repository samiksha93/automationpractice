package day20Opps;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
//		 Animal2 a1 = new Animal2();//instance of Animal2 class
//		 a1.move(); 
				//OR as super keyword is an instance of Parent class so by using this we can access immediate parent class non-static members		
		super.move(); 
		System.out.println("Dogs can walk and run");
		display();
	}
}
public class Overriding2 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); // Animal reference but Dog object
		b.move(); //
	}
}