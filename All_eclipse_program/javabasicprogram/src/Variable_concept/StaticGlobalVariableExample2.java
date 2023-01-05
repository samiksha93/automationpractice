class StaticGlobalVariableExample2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int age=25;
		System.out.println("Age: "+age);
		System.out.println("pinCode is: "+pinCode);
		System.out.println("grade is: "+grade);
		System.out.println("result is: "+result);
		System.out.println("salary is: "+salary);
		System.out.println("***************Updated SGV******************");
		pinCode=1007;
		StaticGlobalVariableExample2.grade='B';
		result=true;//StaticGlobalVariableExample2.result=true;
		StaticGlobalVariableExample2.salary=45000;//salary=45000;
		System.out.println("pinCode is: "+pinCode);
		System.out.println("grade is: "+grade);
		System.out.println("result is: "+result);
		System.out.println("salary is: "+salary);
		System.out.println("Program Ends");
	}
	static int pinCode=1005;
	static char grade='A';
	static boolean result;
	static double salary;
}
