package Scanner_class;

import java.util.Scanner;

public class Take_input {

	public static void main(String[] args) {
		
		String hfksh="hii how are u";
		Scanner s =new Scanner(hfksh);
		System.out.println("......"+s.hasNext());// it will check already input is esxixt or not
		System.out.println();
		Scanner obj1= new Scanner(System.in);
		String name;
		int age;
		double salary;
		boolean status;
		char grade;
		System.out.println("Enter your name:");
		name=obj1.next();
		System.out.println("name:"+name);
		System.out.println("ENter age:");
		age=obj1.nextInt();
		System.out.println("age:"+age);
		System.out.println("Enter your salay:");
		salary = obj1.nextDouble();
		System.out.println("salary is :"+salary);
		System.out.println("Enter your status:");
		status = obj1.nextBoolean();
		System.out.println("status is :"+status);
		System.out.println("Enter grade");
		grade= obj1.next().charAt(0);
		System.out.println("grade is "+grade);
		System.out.println("Enter your address");
		String address = obj1.nextLine();
		System.out.println("your address is :"+address);
		
		System.out.println("**********************************************************");
	
		
		
	}

}
