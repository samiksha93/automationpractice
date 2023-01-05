package while_loop;

public class Reverse_number {

	public static void main(String[] args) {
		int a=948739 ,reverse=0;
		while (a!=0) {
			
			int remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
		
			
			
		}
		System.out.println(reverse);

	}

}


	