class VariableExample9
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		// 50 + 15 =65
		int num1=50,num2=15,result;
		result=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Addition of two number is : "+result);//65
		
		//substraction, re-inilization of result variable
		result=num1-num2;//50-15=35
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Substraction of two number is : "+result);//35
		//multipication	and re-inilization of num1,num2 & result
		num1=15;
		num2=5;
		result= num1*num2;//15*5=75
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Multipication of two number is : "+result);//75
		//division and re-inilization of num1 & result
		num1=100;
		result= num1/num2;//100/5=20
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+result);//20
		System.out.println("Program ends");
	}
}
