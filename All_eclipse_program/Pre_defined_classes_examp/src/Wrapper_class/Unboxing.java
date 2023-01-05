package Wrapper_class;

public class Unboxing {

	public static void main(String[] args) {
     
		int age =30;
		Integer age1 =new Integer(age);//explicit boxing
		
		//only boxed object can be unboxed
		
		int age2=age1.intValue(); //unboxing 
		System.out.println(age2);
		
		System.out.println(age ==age2);
		
		double age3 = age1.intValue();
		System.out.println(age3);
		
		
		
	}

}
