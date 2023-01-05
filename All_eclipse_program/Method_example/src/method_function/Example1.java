package method_function;

public class Example1 {
	
	public int method3(int number) {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		return number;

	}


	   public double MyMethod(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return num1+num2;
	   }
	   public int myMethod(int var1, int var2)
	   {
	      System.out.println("Second myMethod of class Demo");
	      return var1-var2;
	   }
	   public static void main(String args[])
	   {
	      Example1 obj2= new Example1();
	     System.out.println(obj2.myMethod(78,89));
	    
	   }
	}



