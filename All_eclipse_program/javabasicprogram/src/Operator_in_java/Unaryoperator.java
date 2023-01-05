package Operator_in_java;

public class Unaryoperator {

	public static void main(String[] args) {
		int a=10,b=40;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		 // pre: first perform the operation dn use the updated value 
		 // post: first use the value dn perform the operation
		
		int c=++a;//outputc=11 a=11
		System.out.println("a:	"+a		+"	c:	"+c);
		int d=a++;//output d=11 a=12
		System.out.println("a:	"+a		+"	d:	"+d);
		int e=--b;//output e=39 b=39
		System.out.println("b:	"+b		+"	e:	"+e);
		int f=b--;//output f=39 b=38
		System.out.println("b:	"+b		+"	f:	"+f);
		System.out.println(c+d+e+f);
		
	}

}
