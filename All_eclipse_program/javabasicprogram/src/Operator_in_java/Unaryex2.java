package Operator_in_java;

public class Unaryex2 {

	public static void main(String[] args) {
		int a = 55, b;
		b = a++;//b=55,a=56
		int x = a, y;//
		System.out.println(x);// x=56
		System.out.println("*****************************");
		
		y = ++x;// y=57 x=57 
		System.out.println(a);// 56
		System.out.println(b);// 55
		System.out.println(x);// 57
		System.out.println(y);// 57
		System.out.println("*****************************");

		int p = -10, q = 20, res;

		res = p++ + --q;// res =9 		(-10+19)
		System.out.println("res: " + res);//9 
		System.out.println("p: " + p);//-9 
		System.out.println("q: " + q);// 19
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 =-12 (-8+20)
		System.out.println(res1);// -11
		System.out.println("p: " + p);// -8
		System.out.println("q: " + q);//20

	}

}
