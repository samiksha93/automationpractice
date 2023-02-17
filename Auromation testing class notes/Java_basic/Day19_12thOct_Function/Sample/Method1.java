package day10.methods;

public class Method1 {

	/*
	 * accessmodifier: private
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpName
	 * argument/parameter: int
	 * return value: num
	 */
	private static int getEmpName(int id) {
		//statements
		int num=105;
		return num;
	}
	/*
	 * accessmodifier: public
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpContact
	 * argument/parameter: short
	 * return value: 105
	 */
	public static int getEmpContact(short id) {
		//statements
		return 105;
	}
	/*
	 * accessmodifier: protected
	 * non-accessmodifier: static
	 * return type: double
	 * methodName: getEmpPin
	 * argument/parameter: long
	 * return value: id
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: default
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpAccount
	 * argument/parameter: NA
	 * return value: 25
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	public static void main(String[] args) {
		//statement
		//statement
		return;//by default written by java compiler at the time of compilation
	}
	/*
	 * accessmodifier: default
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	/*
	 * accessmodifier: private
	 * non-accessmodifier: non-static
	 * return type: void
	 * methodName: addTwoNumbers
	 * argument/parameter: int, int
	 * return value:res
	 */
	private double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
	}
}
