package for_loop_java;

public class factor_of_neagative_number {

	public static void main(String[] args) {
		int num=82;
		
			if (num<0) {
				System.out.println(num+" number is negative number");
				for (int i=num;i<=Math.abs(num);i++) {
					if (num%i==0) {
						System.out.println("factor of "+num+" is"+i);
					}
				}
				
			}else {
				System.out.println(num+" number is positive number");
				for (int j=0;j<=num;j++) {
					if (num % j == 0) {
					System.out.println("factor of "+num+" is"+j);}
				}
			
		}
	}

}
