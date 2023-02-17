package Abstract;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class Abstract4 {

	public static void main(String[] args) {
		Shape s = new Circle1();
		s.draw();	
		Shape s1 = new Rectangle();
		s1.draw();

	}

}
