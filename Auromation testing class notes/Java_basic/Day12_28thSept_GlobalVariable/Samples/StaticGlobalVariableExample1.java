class StaticGlobalVariableExample1 
{
	static int empId=1001;
	static double salary;
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//local variable
		int age=15;
		System.out.println("Local Variable age: "+age);
		//accessing global variable directly
		System.out.println("SGV empId: "+empId);
		System.out.println("SGV salary: "+salary);
		System.out.println("********************************");
		//accessing global variable with standard
		System.out.println("SGV empId: "+StaticGlobalVariableExample1.empId);
		System.out.println("SGV salary: "+StaticGlobalVariableExample1.salary);
		System.out.println("**************Updated SGV******************");
		empId=1002;
		StaticGlobalVariableExample1.salary=25000.26;
		System.out.println("SGV empId: "+StaticGlobalVariableExample1.empId);
		System.out.println("SGV salary: "+StaticGlobalVariableExample1.salary);
		System.out.println("Program Ends");
	}
}
/**
Varibale declared outside the method body but present inside the class body knowns global variable
if its declared with static keyword dn it will known as static global variable

SGV:
	* always declared with static keyword
	* are also known as class variable
	* because they are loaded in the memory at the time of compilation
	* we can access them from anywhere by using-
			either classname ----> className.staticglobalvariablename ---> Statandard
			or directly
	* they will have single memory allocation in the system
	* if we declared any global variable but not initiliazed then java compiler will
	  initiliaze its value based on the datatype
*/