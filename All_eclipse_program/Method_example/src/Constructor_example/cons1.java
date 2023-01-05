package Constructor_example;

public class cons1 {
	
	public static int method1(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	 
	cons1(){
		 System.out.println("this is a consturctor cons1 with zero perameter");
	}
	cons1(int num3,double num4){
		 System.out.println("this is a consturctor cons2  with int and double ");
	}
	cons1(int num5,int num6 ){
		 System.out.println("this is a consturctor cons3 with int and int ");
	}
	cons1(double num7){
		 System.out.println("this is a consturctor cons4 with int");
	}

	public static void main(String[] args) {

//		System.out.println(method1(56,78));
		cons1 c1 = new cons1();
		cons1 c2 = new cons1(76.9);
		cons1 c3 = new cons1(34,86);
		cons1 c4 = new cons1(34,50.8);
//		obj1.method1(78,87);
//		System.out.println(object1);
		
	}

}
