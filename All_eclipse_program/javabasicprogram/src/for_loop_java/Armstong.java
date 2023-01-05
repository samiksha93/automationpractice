package for_loop_java;

public class Armstong {

	public static void main(String[] args) {
	 int a =1634,n=0 ,b,d;
//	 d=a;
	 for (d=a;d!=0;d=d/10) {
		 

//	 while (d!=0) {
		 b=d%10;
//    	//System.out.println(b);
    	n=n+(b*b*b);
//    	d=d/10;
    	System.out.println(b*b*b);
    }
//    }
	 if (n==a) {
		 System.out.print("number is Armstrong "+a);
	 }
	 else {
		 System.out.print("number is not Armstrong "+a); 

	 
	 }
	}

}

