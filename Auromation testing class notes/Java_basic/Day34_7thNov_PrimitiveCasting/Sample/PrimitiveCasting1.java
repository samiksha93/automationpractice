package day29Casting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int myInt = 9;//
		double myDouble = myInt;//implicit widening, double myDouble = (double)myInt;
		double d=(double)myInt;// explicit widening
		System.out.println(myInt); //9
		System.out.println(myDouble); //9.0
		System.out.println(d);//9.0

		double salary=23400.67856856898989545d;		
		int sal=(int)salary;//explicit narrowing
		long f=(long)salary;//explicit narrowing
		float f1=(float)salary;//explicit narrowing
		double var=sal;//implicit widening/auto widening
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);
		System.out.println("value of var: "+var);
	}

}
