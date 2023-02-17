class GlobalVariables1 
{
	static int empId=1005;
	double salary=45000;
	int pinCode;
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int age=25;
		System.out.println("Local Variable age: "+age);

		System.out.println("SGV empId: "+empId);
		System.out.println("SGV empId with std: "+GlobalVariables1.empId);
		/*
		GlobalVariables1 g1;
		g1= new GlobalVariables1();
		*/
		GlobalVariables1 g1 = new GlobalVariables1();
		System.out.println("with g1, NSGV salary: "+g1.salary);
		g1.salary=65000.45;
		System.out.println("with g1, updated, NSGV salary: "+g1.salary);

		empId=5007;
		System.out.println("SGV empId: "+empId);

		GlobalVariables1 g2 = new GlobalVariables1();
		System.out.println("with g2,NSGV salary: "+g2.salary);
		System.out.println("Program Ends");
	}
}
