package method_function;

public class Example_1 {
//	static int salary=1000;
	
	public static int salary(int sal) {
		int bonus=sal+500;
//		System.out.print(bonus);
		return bonus;
	}
	
	public static double static_average(double num1,double num2,double num3) {
		
		double  res = (num1+num2+num3)/3;
		
		return res;
		}
	
	public void non_static_average(double num1,double num2,double num3) {
		
		double res1 = (num1+num2+num3)/3;
		System.out.println("non_static :"+res1);
			
		
	}
	public static void main(String[] args) {
//		salary(1000); void use 
//		System.out.print(salary(500));// other return type
		
		Example_1 m1=new Example_1();
		
		System.out.println("static :"+Example_1.static_average(23,45,76));
		m1.non_static_average(74,78,87);
		
	}

}
 
