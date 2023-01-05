package this_keyword;

public class Example5 {

	int rollno=100;
	float fee;

	Example5(int rollno) {
		this.rollno = rollno;	
	}
	Example5(int rollno, float fee) {
		this(rollno);// this(112)
		this.fee = fee;		
	}
	
	void display() {
		System.out.println(rollno + " " + fee);
	}
	
	
	
	public static void main(String[] args) {
		
		Example5 s1 = new Example5(111);
		Example5 s2 = new Example5(112, 6000f);
		
		
		s1.display();
		s2.display();
	}
}

