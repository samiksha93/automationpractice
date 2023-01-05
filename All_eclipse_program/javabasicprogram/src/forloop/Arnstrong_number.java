package forloop;

public class Arnstrong_number {

	public static void main(String[] args) {
	 int a =473,n=0 ,b;
	 while (a!=0) {
    	b=a%10;
    	System.out.println(b);
    	n=n+(b*b*b);
    	a=a/10;
    }

	}

}

