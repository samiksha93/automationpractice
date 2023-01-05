
public class check_prime_no {

	public static void main(String[] args) {
		int a=-17;
		for (int i=2;i<=a;i++) {
			if (i==a) {
				System.out.println(a+" is prime no.");
			}else if (a%i==0) {
				System.out.println(a+"not a prime no.");
				break;
			}
		
		}

	}

}
