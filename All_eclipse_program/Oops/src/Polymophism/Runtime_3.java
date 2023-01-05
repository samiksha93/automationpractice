package Polymophism;

// polymorphism not perform bcoz method are not overridded only variable overridded
class Bike {
	int speedlimit = 90;
}
class Honda3 extends Bike {
	int speedlimit = 150;
}
public class Runtime_3{
	public static void main(String args[]){  
	  Bike obj=new Honda3();
	  System.out.println(obj.speedlimit);
	}
}