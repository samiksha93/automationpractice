package this_keyword;

public class Example2 {
	
	int rollno;
	float fee;
	
	Example2(int rollno, float fee) {		
		rollno = rollno;
		fee = fee;
		System.out.println(rollno + " " +  fee);
	}
	
	void display() {
		System.out.println(rollno + " " +  fee);
	}
	
	
	public static void main(String args[]) {
		Example2 s1 = new Example2(111, 5000f);
		Example2 s2 = new Example2(112, 6000f);
		s1.display();//
		s2.display();//
		}
		
	
	}

	

