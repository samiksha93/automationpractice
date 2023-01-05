package String_class;


public final class ImmutableClass {
	/**
	 * Class and its data members should be declared as final
	 * Constructor should be parameterized, so that above data members can be initialize 
	 * Only getter() method should be written in the class for data members
	 */
	final String name;
	final double salary;
	int age;
	ImmutableClass(String name,double salary){
	
		
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
class Sample1{
		public static void main(String[] args) {
			ImmutableClass obj=new ImmutableClass("Pune",656535);
//			System.out.println(obj.Name);
			System.out.println(obj.getSalary());
//			System.out.println(this.Name);
//			obj.name="nbjh";
			obj.age=29;
//			
			//			obj.salary=356565;
			
			ImmutableClass obj2=new ImmutableClass("Mumbai",2454);
			System.out.println(obj2.getName());
			System.out.println(obj2.getSalary());
		}
}
