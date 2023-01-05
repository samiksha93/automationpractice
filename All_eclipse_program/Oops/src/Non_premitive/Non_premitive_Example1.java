package Non_premitive;

// it is example of derived / non primitive up casting :

class Parent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class Non_premitive_Example1  {
	// Main driver method
	public static void main(String[] args) {

		System.out.println("****************Ref parent and Object of child*********************");
		// Creating a Parent class object but referencing it to a Child class.
		// in this type of casting parent class access inherited child class which has both parent and child class memeber.
		// in this casting child class hide its method so we can see or access only parent class method.
		// here we convert child class to parent class
		Parent obj = new Child();//auto-up/implicit up casting
		obj.show();
		obj.callme();
		//obj.readme();
		System.out.println("****************Ref and Object both are of child*********************");
		Child c2=new Child();
		c2.readme();
		c2.callme();
		c2.show();
		System.out.println("****************Ref parent and Object of child*********************");
		// here we covert parent class into child class
		Parent p2=(Parent)c2;//explicit up casting
				//or
		//Parent p2=c2;//implicit up casting
				//or
		//Parent p2=(Parent)new Child();//explicit up casting
		p2.show();
		p2.callme();
//		p2.readme();
	}
}






