package Non_premitive;

// assignment

class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class Upcasting extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		Upcasting u1=new Upcasting(); // upcasting class inherit mumbai and pune class method so access them
		u1.myCity();
		u1.Kurla();
		u1.Deccan();
		
		Mumbai m1=new Upcasting();// implicit upcasting. yha per upcasting apne memeber ko hide ker dega or sirf mumbai k memeber show honge ,mumbai m pune ko inherit kiya h to pune k member ko v mumbai class se access kr skte h
		m1.Kurla();
		m1.Deccan();
		
		
		Mumbai m2=u1;//Mumbai m2new Upcasting()  ;  yha per v  implicit upcasting hui h. 
		m2.Kurla();
		m2.Deccan();
		
		Pune p1=new Upcasting();//implicit upcasting
		p1.Deccan();
		
		Pune p2=u1;//implicit upcasting
		p2.Deccan();
		
		Mumbai m3=(Mumbai)new Upcasting();// expilicit upcasting
		m3.Kurla();
		m3.Deccan();
		
		Mumbai m4=(Mumbai)u1;//expilicit upcasting
		m4.Kurla();
		m4.Deccan();
		
		Pune p3=(Pune) new Upcasting();//expilicit upcasting
		p3.Deccan();
		
		Pune p4=(Pune)u1;//expilicit upcasting
		p4.Deccan();
		
		Pune p5=new Mumbai();// implicit upcasting
		p5.Deccan();
		
		Pune p6=(Pune)new Mumbai();///expilicit upcasting
		p6.Deccan();
		
	}

}
