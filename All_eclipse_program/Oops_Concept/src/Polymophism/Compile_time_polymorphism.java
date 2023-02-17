package Polymophism;

public class Compile_time_polymorphism {

		static void sum(int a, int b) {
			int c = a + b;
			System.out.println("Addition of two numbers :" + c);
		}
		static void sum(int a, int b, int e) {
			int c = a + b + e;
			System.out.println("Addition of three numbers :" + c);
		}
		public static void main(String[] args) {

			Compile_time_polymorphism.sum(45, 80, 22);
			Compile_time_polymorphism.sum(10,90);
		}
	}

	

