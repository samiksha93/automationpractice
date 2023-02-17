package Variable_concept;
class NonStaticGlobalVariableExample1 
{
	int empId=1001;
	double salary;
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//local variable
		int age=15;
		System.out.println("Local Variable age: "+age);
		//System.out.println("NSGV empId: "+empId); //compile time error
		//System.out.println("NSGV salary: "+salary);//compile time error

		/* Creating an instance/object to access non-static members of the class*/
		/* 
		NonStaticGlobalVariableExample1 n1;
		n1 = new NonStaticGlobalVariableExample1();
		*/
		NonStaticGlobalVariableExample1 n1 = new NonStaticGlobalVariableExample1();
		System.out.println("NSGV empId: "+n1.empId); 
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("****************Updated NSGV***********************");
		n1.empId=5001;
		n1.salary=45222.655;
		System.out.println("NSGV empId: "+n1.empId); 
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("Program Ends");
	}
}
/**
Varibale declared outside the method body but present inside the class body knowns global variable
if its declared without static keyword dn it will known as nonstatic global variable

NSGV:
	* always declared without static keyword
	* are also known as instance/object variable
	* because they are loaded in the memory at the time of execution when object is created
	* to access non-static member, first we need load them into the memory by creating an instance/object
		Syntax to create an object:(will be created in the Heap memory which is a rando storage area)
					classname referenceVariable; // object declaration
					referenceVariable = new classname();//object initiliazation
							//or
					classname referenceVariable = new classname();

					referenceVariable.nonstaticMember
			
	* NSGV we will multiple copies in the memory allocation depending on objecting
	* if we declared any global variable but not initiliazed then java compiler will
	  initiliaze its value based on the datatype
*/