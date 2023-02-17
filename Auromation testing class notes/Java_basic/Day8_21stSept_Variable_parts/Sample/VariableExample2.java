class VariableExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89 | -128 | 127
		shortVariable = 50;//-10 | -89 | 90 | -15
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25 | 5 | 55 |-65
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z' | '#'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable");//byteVariable
		System.out.println(byteVariable);//25
		System.out.println(shortVariable);//50
		System.out.println(intVariable);//150
		System.out.println(longVariable);//2530
		System.out.println(floatVariable);//25.36
		System.out.println(doubleVariable);//36.56
		System.out.println(charVariable);//A
		System.out.println(booleanVariable);//true
		System.out.println("Program ends");
	}
}
