package this_keyword;

public class Example3 {

	int rollno;
	float fee;
	
	Example3(int rollno) {
		this.rollno = rollno;
	}
	Example3(int rollno, float fee) {
		this(rollno);// reusing constructor
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}

	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		Example3 s1 = new Example3(111);//
		System.out.println(s1.rollno + " " + s1.fee);//
		System.out.println("**********************Creating S2 object***************************");
		Example3 s2 = new Example3(112, 6000f);//
		System.out.println(s2.rollno + " " + s2.fee);//
		System.out.println("*****************Display()*************************");
		s1.display();//
		s2.display();//
	}
}
