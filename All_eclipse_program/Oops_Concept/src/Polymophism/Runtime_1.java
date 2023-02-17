package Polymophism;

class Car {
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	void run()
	{
		System.out.println("running fast at 120km");
	}
}

public class Runtime_1 {

	public static void main(String args[]) {
		Car c = new innova();
		c.run();//
	}
}



/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */