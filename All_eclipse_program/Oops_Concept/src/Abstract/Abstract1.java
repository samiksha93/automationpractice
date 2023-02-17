package Abstract;
//Abstract class
// hierarchical inheritance
abstract class Animal {
	
	public abstract void animalSound();// abstract method does not have any body
	
	public void sleep() {
		System.out.println("Zzz");
	}
}
// inherit class animal
class Pig extends Animal {
	// override animal sound  method 
	public void animalSound() { 
		
		System.out.println("The pig says: wee wee");//provide body for abstract class
	}
}
// inherit class animal 
class Dog8 extends Animal {
	// override animal sound  method 
	public void animalSound() {
		
		System.out.println("The dog says: bow bow");//provide body for abstract class
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		Pig obje2= new Pig();
		obje2.animalSound();
		obje2.sleep();
		Dog8 obj1= new Dog8();
		obj1.animalSound();
		obj1.sleep();
		
		
	}

}
