package this_keyword;

public class Example1 {

		int rollno;
		float fee;
		
		Example1(int rollno, float fee) {
			
			System.out.println("Local varibale: "+rollno);
			System.out.println("Local varibale: "+fee);
			System.out.println("Global varibale: "+this.rollno);
			System.out.println("Global varibale: "+this.fee);
			//global variable = local variable
			
			this.rollno = rollno;
			this.fee = fee;
			
			System.out.println("Local varibale: "+rollno);
			System.out.println("Local varibale: "+fee);
			System.out.println("Global varibale: "+this.rollno);
			System.out.println("Global varibale: "+this.fee);
		}
		void display() {
			int rollno=3333;
			float fee=598049f;
			System.out.println(rollno + " " +  fee);
		}

		public static void main(String args[]) {
			
			Example1 s1 = new Example1(111, 5000f);
			s1.display();//
			
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			
			Example1 s2 = new Example1(112, 6000f);
			s2.display();//
		}
	}


