package while_loop;

public class count_digit {

	public static void main(String[] args) {
		
		int i=2323876, count=0;
		
		while (i!=0) {
			
			i/=10;
			count++;
			
			}
		
		System.out.print(count);
	}

}
