package day28Encapsulation;

class TestEncap {

	private int age = 25;
	private double salary = 45000;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

public class Example1 {

	public static void main(String[] args) {
		TestEncap t1=new TestEncap();
//		System.out.println("Age: "+t1.age);
//		System.out.println("Salary: "+t1.salary);
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		System.out.println("**********************************");
//		t1.age=30;
//		t1.salary=55000;
		t1.setAge(30);
		t1.setSalary(55000);
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		System.out.println("####################################");
		TestEncap t2=new TestEncap();
		System.out.println(t2.getAge());
		System.out.println(t2.getSalary());
	}

}
