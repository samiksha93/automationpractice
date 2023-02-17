class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int num1=10,num2;//error at compile time as it's not initilize
		int res = num1 + num2;
		System.out.println("Result is: "+res);
		System.out.println("Program Ends");
	}
}
/**
Variable declared inside the method body known as local variable
these variables are accessible with in the method body
these variable should be initiliaze before we use them
these variable can't be declared as static
*/